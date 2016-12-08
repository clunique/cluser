package com.cluser.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.assertj.core.util.Strings;

import com.cluser.enums.TokenTypes;
import com.cluser.view.anotation.RequestToken;
import com.cluser.view.request.TokenCreationVO;

public class TokenCreationValidator implements ConstraintValidator<RequestToken, TokenCreationVO> {
    public static final String ERR_DESC_TOKENTYPE = "only could be PASSWORD, REFRESH, RESETPASSWORD";
    public static final String ERR_DESC_CONFLICT_INF = "Request token info error";
    public static final String defaultProperty = "opType";
    @Override
    public void initialize(RequestToken constraintAnnotation) {
    }

    @Override
    public boolean isValid(TokenCreationVO value, ConstraintValidatorContext context) {
        boolean returnFlg = false;
        if(TokenTypes.REFRESH.getValue().equalsIgnoreCase(value.getOpType())){
            if(!Strings.isNullOrEmpty(value.getRefreshToken()) &&
              (null == value.getLoginInfo() ||
                      (Strings.isNullOrEmpty(value.getLoginInfo().getUsername()) && Strings.isNullOrEmpty(value.getLoginInfo().getPassword()))))
                returnFlg = true;
        }else if(TokenTypes.ACCESS.getValue().equalsIgnoreCase(value.getOpType())){
            if(null != value.getLoginInfo() &&
                    (!Strings.isNullOrEmpty(value.getLoginInfo().getUsername()) && !Strings.isNullOrEmpty(value.getLoginInfo().getPassword())) &&
                      Strings.isNullOrEmpty(value.getRefreshToken())){
                    returnFlg = true;
            }
        }else if(TokenTypes.RESETPWD.getValue().equalsIgnoreCase(value.getOpType())){
            if(!Strings.isNullOrEmpty(value.getUsername()) &&
                    (null == value.getLoginInfo() || (Strings.isNullOrEmpty(value.getLoginInfo().getUsername()) && Strings.isNullOrEmpty(value.getLoginInfo().getPassword()))))
                returnFlg = true;
        }else{
            return handleConstraintViolation(context, defaultProperty, ERR_DESC_TOKENTYPE);
        }
        if(returnFlg){
            if(Strings.isNullOrEmpty(value.getRefreshToken()) || null == value.getLoginInfo() ||
               (Strings.isNullOrEmpty(value.getLoginInfo().getUsername()) && Strings.isNullOrEmpty(value.getLoginInfo().getPassword())))
                return true;
        }
        return handleConstraintViolation(context, defaultProperty, ERR_DESC_CONFLICT_INF);
    }
    private boolean handleConstraintViolation(ConstraintValidatorContext context,String propertyName, String message){
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(message)
                .addPropertyNode(propertyName)
                .addConstraintViolation();
        return false;

    }
}
