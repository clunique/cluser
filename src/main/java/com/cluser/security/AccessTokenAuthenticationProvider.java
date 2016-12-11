package com.cluser.security;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.NonceExpiredException;

import com.cluser.exception.TransactionErrorType;
import com.cluser.exception.UserCenterException;
import com.cluser.service.TokenService;

import io.jsonwebtoken.lang.Strings;

/**
 * Created by Lou Chen Xi on 31/10/2016.
 */
public class AccessTokenAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    private static Logger logger = LoggerFactory.getLogger(AccessTokenAuthenticationProvider.class);
    @Override
    public boolean supports(Class<?> authentication) {
        return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
        String token = jwtAuthenticationToken.getToken();

        AccessTokenInfo tokenInfo;
        try {
            tokenInfo = TokenService.parseAccessToken(token);
        } catch (UserCenterException e) {
            logger.debug("Authentication failure. Access token could not be parsed");
            throw new BadCredentialsException(e.getMessage());
        }
        if (null != tokenInfo) {
            if(tokenInfo.expired()) {
                logger.debug("Authentication failure. Access token expired");
                throw new NonceExpiredException(TransactionErrorType.TOKEN_EXPIRED_ERROR.getDesc());
            }
            String subject = tokenInfo.getSubject();
            String principle = tokenInfo.getUsername();
            String authZInfo = tokenInfo.getScope();

            String commaAuthZInfo = Strings.replace(authZInfo, "\n", ",");
            List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList(commaAuthZInfo);
            User user = new User(principle+"$" +subject, principle, authorityList);
            logger.debug("user {} sub {} authentication success", principle, subject);
            return user;
        } else {
            throw new BadCredentialsException(TransactionErrorType.TOKEN_INVALID_ERROR.getDesc());
        }
    }
}
