package com.cluser.dao.enums;

/**
 * UserGender
 *
 * @author Anbang Wang
 * @date 2016/11/3
 */
public enum UserGender {
    MALE("MALE"), FEMAIL("FEMAIL"), SECRET("SECRET");

    String value;
    private UserGender(String value){
        this.value = value;
    }
}
