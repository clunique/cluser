package com.cluser.business;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cluser.dao.model.TUser;
import com.cluser.enums.TokenTypes;
import com.cluser.exception.TokenException;
import com.cluser.exception.TransactionErrorType;
import com.cluser.exception.UserCenterException;
import com.cluser.exception.UserException;
import com.cluser.service.UserService;
import com.cluser.view.request.TokenCreationVO;
import com.cluser.view.response.TokenInfoVO;

@Service("tokenBusiness")
public class TokenBusiness {
	private static final Logger logger = LoggerFactory.getLogger(TokenBusiness.class);
	
	@Resource
	UserService userService;
	
	public TokenInfoVO createToken(TokenCreationVO token) throws UserCenterException {
        TokenInfoVO returnTokenInfoVO = new TokenInfoVO();
        
        if(TokenTypes.ACCESS.getValue().equalsIgnoreCase(token.getOpType())){
        	String username = token.getLoginInfo().getUsername();
            String pwd = token.getLoginInfo().getPassword();
            TUser tUser = userService.getUserByUsername(username);
            if(tUser == null) {
            	logger.error("createToken: username {} is NOT found.", username);
            	new UserException(HttpStatus.NOT_FOUND, TransactionErrorType.USER_NAME_PASSWORD_INCONSISTENT);
            }
            if(tUser.getPassword().equals(pwd)) {
            	returnTokenInfoVO.setAccessTokenValue("aaabbbccc");
            }else {
            	logger.error("createToken: password of username {} is NOT correct.", username);
            	new UserException(HttpStatus.NOT_FOUND, TransactionErrorType.USER_NAME_PASSWORD_INCONSISTENT);
            }
        }else if(TokenTypes.REFRESH.getValue().equalsIgnoreCase(token.getOpType())){
        	
        }else if(TokenTypes.RESETPWD.getValue().equalsIgnoreCase(token.getOpType())){
        	
        }else {
        	throw new TokenException(HttpStatus.BAD_REQUEST);
        }
        
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
