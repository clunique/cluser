package com.cluser.dao.enums;

/**
 * UserType
 *
 * @author Anbang Wang
 * @date 2016/11/3
 */
public enum UserType {
    END_USER("END_USER"), PROGRAM_USER("PROGRAM_USER"), ADMIN("ADMIN");

    String value;

    UserType(String value) {
        this.value = value;
    }
}
