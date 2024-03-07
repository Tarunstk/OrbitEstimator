package com.example.src.main.java.orbittracker;

public class dbProperties {
    private String url = "jdbc:postgresql://localhost:5432/satellites";
    private String password = "1797";
    private String username = "postgres";

    public dbProperties() {
    }

    public dbProperties(String url, String password, String username) {
        this.url = url;
        this.password = password;
        this.username = username;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "dbProperties{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
