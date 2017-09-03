package com.hilalelmas.search.view.entity;

public class LoginEntity {
    String username;
    String password;

    String personusername;
    PersonEntity personEntity;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }
}
