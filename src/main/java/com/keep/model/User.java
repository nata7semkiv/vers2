package com.keep.model;

import java.util.Objects;

/**
 * User for project
 */
public class User {
    private String username;
    private String password;
    private String name;

    public User() {
    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, name);
    }

    /**
     * Check login and password
     * @param username
     * @param password
     * @return true if user exists
     */
    public boolean loginCheck(String username, String password){

        if(username.toLowerCase().equals(this.username.toLowerCase())
                && password.equals(this.password)){
            return true;
        }

        return false;
    }
}
