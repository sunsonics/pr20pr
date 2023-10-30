package com.example.pr20yeeep;
public class User {
    private String name;
    private String dsName;
    private String email;

    public User() {
        // Обязательный пустой конструктор для Firebase
    }

    public User(String name, String dsName, String email) {
        this.name = name;
        this.dsName = dsName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
