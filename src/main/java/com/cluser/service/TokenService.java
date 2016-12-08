package com.cluser.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cluser.enums.TokenTypes;
import com.cluser.exception.ClUserException;
import com.cluser.view.request.TokenCreationVO;
import com.cluser.view.response.TokenInfoVO;

@Service("tokenService")
public class TokenService {
	private static final Logger logger = LoggerFactory.getLogger(TokenService.class);
	
	public TokenInfoVO createToken(TokenCreationVO token) throws ClUserException {
        TokenInfoVO returnTokenInfoVO = new TokenInfoVO();
//        String accessToken;
//        String refreshToken;
//        if(TokenTypes.ACCESS.getValue().equalsIgnoreCase(token.getOpType())){
//            String userId = token.getLoginInfo().getUsername();
//            String pwd = token.getLoginInfo().getPassword();
//            logger.info("Process token creation. token_type:{}, username:{}", TokenTypes.ACCESS.getValue(), userId);
//            userService.verifyUserAccount(userId, pwd);
//            PersonPO personPO = userService.getBasicUserPOByUid(userId);
//            accessToken = jwtTokenResolver.genToken(personPO);
//            refreshToken = getTokenManager().createRefreshToken(personPO);
//            returnTokenInfoVO.setAccessTokenValue(accessToken);
//            returnTokenInfoVO.setRefreshTokenValue(refreshToken);
//        }else if(TokenTypes.REFRESH.getValue().equalsIgnoreCase(token.getOpType())){
//            String refreshTokenStr = token.getRefreshToken();
//            AuthToken authToken = getTokenManager().loadValidAuthToken(refreshTokenStr);
//            checkRefreshToken(authToken);
//            String uid = authToken.getOwnerUserID();
//            PersonPO personPO = userService.getBasicUserPOByUid(uid);
//            accessToken = jwtTokenResolver.genToken(personPO);
//            returnTokenInfoVO.setAccessTokenValue(accessToken);
//            getTokenManager().extendRefreshTokenExp(authToken.getTokenID());
//        }else if(TokenTypes.RESETPWD.getValue().equalsIgnoreCase(token.getOpType())){
//            PersonPO personPO = userService.getBasicUserPOByUid(token.getUsername());
//            String resetPwdToken = getTokenManager().createPasswordResetToken(personPO);
//            returnTokenInfoVO.setResetPasswordTokenValue(resetPwdToken);
//        }else {
//            throw new TokenException(HttpStatus.BAD_REQUEST);
//        }
        logger.debug("Create token success");
        return returnTokenInfoVO;
    }
}
