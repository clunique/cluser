package com.cluser.exception;

public interface TransactionErrorDescription {

    String UNKNOWN_ERROR_DESC = "Server Unknown Error %s";
    int UNKNOWN_ERROR_CODE = 1010000;
    
    String UNKNOWN_OPENDJ_ERROR_DESC = "Internal server error";
    int UNKNOWN_OPENDJ_ERROR_CODE = 1010001;
    
    String INVALID_REQUEST_PARAM_DESC = "Invalid Request Parameter";
    int INVALID_REQUEST_PARAM_ERROR_CODE = 1010002;

    // Error about token; 10101xx
    int TOKEN_INVALID_ERROR_CODE = 1010101;
    String TOKEN_INVALID_ERROR_DESC = "Token invalid ";
    int TOKEN_EXPIRED_ERROR_CODE = 1010102;
    String TOKEN_EXPIRED_ERROR_DESC = "Token expired";
    int TOKEN_REQUEST_NOTFOUND_CODE = 1010103;
    String TOKEN_REQUEST_NOTFOUND_DESC = "Request token not found";
    int TOKEN_REQUEST_EXPIRED_CODE = 1010104;
    String TOKEN_REQUEST_EXPIRRED_DESC = "Request token expired";
    int TOKEN_REQUEST_INVALID_CODE = 1010105;
    String TOKEN_REQUEST_INVALID_DESC = "Request token invalid";


    // Error about user; 10102xx
    String USER_NAME_PASSWORD_INCONSISTENT_DESC = "username or password is not correct";
    int USER_NAME_PASSWORD_INCONSISTENT_ERROR_CODE = 1010200;
    String USER_NOT_FOUND_DESC = "User Not Found";
    int USER_NOT_FOUND_ERROR_CODE = 1010201;
    String USER_INVALID_DESC = "User invalid";
    int USER_INVALID_ERROR_CODE = 1010202;
    String USER_ALREADY_EXISTS_DESC = "user with the same id already exists";
    int USER_ALREADY_EXISTS_ERROR_CODE = 1010203;
    String ILLEGAL_USER_ATTR_FOR_CREATE_DESC = "illegal user attribute for create";
    int ILLEGAL_USER_ATTR_FOR_CREATE_ERROR_CODE = 1010204;
    String ILLEGAL_USER_ATTR_FOR_UPDATE_DESC = "illegal user attribute for update";
    int ILLEGAL_USER_ATTR_FOR_UPDATE_ERROR_CODE = 1010205;
    String USER_ATTR_UNKNOWN_DESC = "user attribute is unknown";
    int USER_ATTR_UNKNOWN_ERROR_CODE = 1010206;
    String USER_ATTR_VALUE_INVALID_DESC = "user attribute value is invalid";
    int USER_ATTR_VALUE_INVALID_ERROR_CODE = 1010207;
    String USER_ATTR_MISSED_DESC = "user attribute value is missed";
    int USER_ATTR_MISSED_ERROR_CODE = 1010208;

    // Error about organization; 10103xx
    String ORG_INVALID_ID_DESC = "Invalid Organization ID";
    int ORG_INVALID_ID_ERROR_CODE = 1010300;
    String ORG_NOT_FOUND_DESC = "Organization Not Found";
    int ORG_NOT_FOUND_ERROR_CODE = 1010301;
    String ORG_ALREADY_EXISTS_DESC = "Organization with the same name already exists";
    int ORG_ALREADY_EXISTS_ERROR_CODE = 1010302;
    String ORG_ROOT_CANNOT_MODIFY_DESC = "Cannot modify,delete,move root org, user cannot join/leave root org";
    int ORG_ROOT_CANNOT_MODIFY_ERROR_CODE = 1010303;
    String ORG_NEED_CASCADE_DELETE_DESC = "org has children, but cascade delete is false or not specified";
    int ORG_NEED_CASCADE_DELETE_ERROR_CODE = 1010304;
    String ORG_ALREADY_HAS_USER_DESC = "Organization Already Has User";
    int ORG_ALREADY_HAS_USER_ERROR_CODE = 1010305;
    String ORG_HAS_NO_USER_DESC = "Organization Doesn't Have User";
    int ORG_HAS_NO_USER_ERROR_CODE = 1010306;
    String ORG_JOIN_ERROR_DESC = "User Join Organzation Error";
    int ORG_JOIN_ERROR_ERROR_CODE = 1010307;
    String ORG_LEAVE_ERROR_DESC = "User Leave Organzation Error";
    int ORG_LEAVE_ERROR_ERROR_CODE = 1010308;
    String ORG_NAME_CANNOT_BE_EMPTY_DESC = "name: may not be empty";
    int ORG_NAME_CANNOT_BE_EMPTY_ERROR_CODE = INVALID_REQUEST_PARAM_ERROR_CODE;

    // Error about user data schema; 10104xx
    String USER_SCHEMA_NOT_FOUND_DESC = "User Schema Not Found";
    int USER_SCHEMA_NOT_FOUND_CODE = 1010401;
    String USER_SCHEMA_ATTR_EXIST_DESC = "Attribute already exists";
    int USER_SCHEMA_ATTR_EXIST_CODE = 1010402;
    String USER_SCHEMA_OBJECT_CALSS_NOT_FOUND_DESC = "User schema object class is not exist";
    int USER_SCHEMA_OBJECT_CALSS_NOT_FOUND_CODE = 1010403;
    String USER_SCHEMA_ATTR_NOT_FOUND_DESC = "attribute does not exist";
    int USER_SCHEMA_ATTR_NOT_FOUND_CODE = 1010404;
    String USER_SCHEMA_ATTR_DATA_TYPE_INVALID_DESC = "attribute data type is not support";
    int USER_SCHEMA_ATTR_DATA_TYPE_INVALID_CODE = 1010405;
    String USER_SCHEMA_ATTR_DATA_CAN_NOT_FORMAT_DESC = "attribute data is can not format, May contain special characters!";
    int USER_SCHEMA_ATTR_DATA_CAN_NOT_FORMAT_CODE = 1010406;
    
    int URL_RESOURCE_NOTFOUND_CODE = 1111100;
    String URL_RESOURCE_NOTFOUND_DESC = "Request %s not found";
    int UNAUTHORIZED_CODE = 1111101;
    String UNAUTHORIZED_DESC = "Unauthorized request";
    int INSUFFICIENT_PRIVILEGES_CODE = 1111102;
    String INSUFFICIENT_PRIVILEGES_DESC = "Insufficient privileges";
   
    int SELF_OPERATION_LIMIT_CODE = 1111103;
    String SELF_OPERATION_LIMIT_DESC = "Could not request others resource";
    
}
