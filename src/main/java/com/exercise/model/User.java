package com.exercise.model;

import com.exercise.model.Phone;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.List;


public class User {
    private String title;
    private String email;
    private String password;
    private List<Phone> ownPhones = new ArrayList<>();
    private String created;
    private String modified;
    private String last_login;
    private Boolean isactive;


    public User() { }

    /**
    * @param _title
    * @param _email
    * @param _password
    * @param _ownPhone
    */
    public User(String _title, String _email, String _password, List<Phone> _ownPhone) {
        this.title = _title;
        this.email = _email;
        this.password = _password;
        this.ownPhones = _ownPhone;
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

    // GETTER AND SETTER
    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Phone> getPhone() {
        return ownPhones;
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

    // PUBLIC METHODS
    /**
    * 
    * @return
    * @throws IOException 
    * @throws JsonParseException 
    * @throws JsonProcessingException
    */
    public boolean isPassValid() {
        String pattern = "^([A-Z]{1})([a-z]+)([0-9]{2})$";

        return password.matches(pattern);
    }

    /**
    * 
    * @return
    * @throws IOException 
    * @throws JsonParseException 
    * @throws JsonProcessingException
    */
    public boolean isEmailValid() {
        String pattern = "^[a-z]+@[a-z]+\\.[a-z]{2,5}$";

        return email.matches(pattern);
    }

}
