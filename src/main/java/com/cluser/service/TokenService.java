package com.cluser.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cluser.constant.JwtClaim;
import com.cluser.dao.model.TUser;
import com.cluser.exception.TokenException;
import com.cluser.exception.UserCenterException;
import com.cluser.security.AccessTokenInfo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service("tokenService")
public class TokenService {
	private static final Logger logger = LoggerFactory.getLogger(TokenService.class);
	
	public String genToken(TUser tUser){
        Date genTm = new Date();
        Date expTm = new Date(genTm.getTime() + 10 * 60 * 1000);

        Map<String, Object> privateClaims = new HashMap<String, Object>();
        privateClaims.put(JwtClaim.SUB, tUser.getId());
        privateClaims.put(JwtClaim.USERNAME, tUser.getUsername());

        String privateKey = "1234567890";
        final String token = Jwts.builder()
                .setClaims(privateClaims)
                .signWith(SignatureAlgorithm.HS256, privateKey)
                .compact();
        return token;
    }
	
	public static AccessTokenInfo parseAccessToken(String tokenStr) throws UserCenterException {
        Jws<Claims> jws = null;
        String privateKey = "1234567890"; 
        try {
            jws = Jwts.parser().setSigningKey(privateKey).parseClaimsJws(tokenStr.trim());
        } catch (Exception e) {
            throw new TokenException(HttpStatus.BAD_REQUEST);
        }
        if(null == jws.getBody() || null == jws.getHeader())
            throw new TokenException(HttpStatus.BAD_REQUEST);

        if(SignatureAlgorithm.HS256.getValue().equals(jws.getHeader().getAlgorithm())){
            AccessTokenInfo accessTokenInfo = new AccessTokenInfo();
            try{
                accessTokenInfo.setSubject(jws.getBody().get(JwtClaim.SUB).toString());
                accessTokenInfo.setUsername(jws.getBody().get(JwtClaim.USERNAME).toString());
//                accessTokenInfo.setPrefferedName(jws.getBody().get(Constant.JWT_CLAIM_PREFFERD_USERNAME).toString());
//                long expStr = Long.valueOf(jws.getBody().get(Constant.JWT_CLAIM_EXP).toString());
//                accessTokenInfo.setExpirationDate(new Date(expStr));
//                accessTokenInfo.setTokenType(jws.getBody().get(Constant.JWT_CLAIM_TYPE).toString());
//                accessTokenInfo.setScope(jws.getBody().get(Constant.JWT_CLAIM_SCOPE).toString());
//                accessTokenInfo.setIssuer(jws.getBody().get(Constant.JWT_CLAIM_ISS).toString());
//                accessTokenInfo.setAud(jws.getBody().get(Constant.JWT_CLAIM_AUD).toString());
//                accessTokenInfo.setHostId(jws.getBody().get(Constant.JWT_CLAIM_HOST_ID).toString());

            }
            catch (Exception e){
                throw new TokenException(HttpStatus.BAD_REQUEST);
            }
            return accessTokenInfo;
        }else{
            //Algorithm is not same as settings
            throw new TokenException();
        }
    }
}
