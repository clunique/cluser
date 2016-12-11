package com.cluser.security;

import java.util.Date;

/**
 * Created by Lou Chen Xi on 31/10/2016.
 */
public class AccessTokenInfo {
    private String username;
    private String subject;
    private String status;
    private String tokenType;
    private String issuer;
    private String aud;
    private String prefferedName;
    private String hostId;
    private String scope;
    private Date expirationDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean expired(){
        return new Date().after(expirationDate);
    }

    public String getPrefferedName() {
        return prefferedName;
    }

    public void setPrefferedName(String prefferedName) {
        this.prefferedName = prefferedName;
    }
}
