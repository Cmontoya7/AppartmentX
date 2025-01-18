package com.gcu.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {

    @NotNull(message = "User Name is a required field")
    @Size(min = 6, max = 32, message = "User Name must be between 6-32 characters long.")
    private String username;

    @NotNull(message = "Password is a required field")
    @Size(min = 8, max = 32, message = "User Name must be between 8-32 characters long.")
    private String password;

    public boolean loggedIn = false;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void loginTrue() {
        this.loggedIn = true;
    }
}
