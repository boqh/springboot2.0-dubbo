package com.bqh.system.shiro.realm;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author boqh
 * @Description
 * @date 2018-10-30 13:58
 */
public class UserToken implements AuthenticationToken {

    private String username;
    private String token;

    public UserToken(String username, String token) {
        this.username = username;
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return this.username;
    }

    @Override
    public Object getCredentials() {
        return this.token;
    }

    public void clear() {
        this.username = null;
        this.token = null;
    }
}