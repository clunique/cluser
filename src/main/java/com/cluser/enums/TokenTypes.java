package com.cluser.enums;


import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum TokenTypes {
    ACCESS("ACCESS"),
    REFRESH("REFRESH"),
    RESETPWD("RESETPASSWORD");

    private TokenTypes(String value) {
        this.value = value;
    }
    
    private String value;
    
    public String getValue() {
        return this.value;
    }
    
    public static final Set<TokenTypes> KNOWN_VALUES;

    static {
        EnumSet<TokenTypes> kv = EnumSet.allOf(TokenTypes.class);
        KNOWN_VALUES = Collections.unmodifiableSet(kv);
    }

    public static TokenTypes getValue(String value){
        if(null == value)
            value = "";
        TokenTypes[] tokenTypes = TokenTypes.values();
        for(TokenTypes tokenType: tokenTypes){
            if(value.equals(tokenType.getValue()))
                return tokenType;
        }
        return null;
    }
}
