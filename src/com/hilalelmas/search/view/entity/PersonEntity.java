package com.hilalelmas.search.view.entity;

public class PersonEntity {
    private String name;
    private String personusername;
    private String password;
    private String birthday;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPersonusername(String username) {
        this.personusername = username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getPersonusername() {
        return personusername;
    }
}
