package com.revature.spms.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
    private static final long serialVersionUID = -5616176897013108345L;

    private String username;
    private String password;
    
    //==================Token Created in Talend ===============
    //  {
    //    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwNzM2ODkwMCwiaWF0IjoxNjA2NzY0MTAwfQ.8ubw9gyP6LjIhDr86d5DQY6ASVcNi0tzlV1UEJ_xp7u2GkiKlqzlLS8AXNWwPs5GKzan_SHTkBYZTSB2f-tkVg"
    //  }
    //=========================================================

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

