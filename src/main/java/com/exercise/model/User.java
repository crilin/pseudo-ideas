package com.exercise.model;

import java.time.*;
import java.time.format.*;

public class User {
    private String title;
    private String email;
    private String password;
    private String created;
    private String modified;
    private String last_login;
    private Boolean isactive;


    public User() { }

    public User(String _title, String _email, String _password) {
        this.title = _title;
        this.email = _email;
        this.password = _password;
        this.created = LocalDate.now().toString();
        this.modified = LocalDate.now().toString();
        this.last_login = LocalDate.now().toString();
        this.isactive = true;
    }

public User(String _title, String _email, String _password, String _created, String _modified, String _last_login, Boolean _isactive) {
        this.title = _title;
        this.email = _email;
        this.password = _password;
        this.created = _created;
        this.modified = _modified;
        this.last_login = _last_login;
        this.isactive = _isactive;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public String getLast_login() {
        return last_login;
    }

    public Boolean getIsactive() {
        return isactive;
    }

/*    public void setCreated(String _created) {
        System.out.println("Fecha recibida: " + _created);
        created = LocalDate.parse(_created);
    }

    public void setModified(String _modified) {
        System.out.println("Fecha recibida: " + _modified);
        this.modified = LocalDate.parse(_modified);
    }

    public void setLast_login(String _last_login) {
        System.out.println("Fecha recibida: " + _last_login);
        this.last_login = LocalDate.parse(_last_login);
    }*/
}
