package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {
    private UUID id;
    private String username;

    public User(@JsonProperty("id") UUID id
            , @JsonProperty("username") String username) {
        this.id = id;
        this.username = username;

    }

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId(){
        return this.id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
