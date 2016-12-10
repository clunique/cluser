package com.cluser.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cluser.constant.JwtClaim;
import com.cluser.dao.model.TUser;

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
        privateClaims.put(JwtClaim.USERNAME, tUser.getUserName());

        String privateKey = "1234567890";
        final String token = Jwts.builder()
                .setClaims(privateClaims)
                .signWith(SignatureAlgorithm.HS256, privateKey)
                .compact();
        return token;
    }
}
