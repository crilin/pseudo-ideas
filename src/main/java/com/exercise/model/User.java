package com.exercise.model;

import com.exercise.model.Phone;
import java.time.*;
import java.time.format.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
 
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITLE")
    @Size(max = 50)
    private String title;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    //@Column(name = "PHONE_ID")
    //private List<Phone> ownPhones = new ArrayList<>();
    
    @Column(name = "CREATED_DATE")
    private String created;
    
    @Column(name = "MODIFIED_DATE")
    private String modified;
    
    @Column(name = "LOGIN_DATE")
    private String last_login;
    
    @Column(name = "IS_ACTIVE")
    private Boolean isactive;


    /**
    * @param _title
    * @param _email
    * @param _password
    * @param _ownPhone
    */
    //public User(String _title, String _email, String _password, List<Phone> _ownPhone) {
    public User(String _title, String _email, String _password) {
        this.title = _title;
        this.email = _email;
        this.password = _password;
        //this.ownPhones = _ownPhone;
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
    public Long getId() {
        return id;
    }

    public void SetId(Long _id) {
        this.id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void SetTitle(String _title) {
        this.title = _title;
    }

    public String getEmail() {
        return email;
    }

    public void SetEmail(String _email) {
        this.email = _email;
    }

    public String getPassword() {
        return password;
    }

    public void SetPassword(String _password) {
        this.password = _password;
    }

    /*public List<Phone> getPhone() {
        return ownPhones;
    }*/

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public String getLast_login() {
        return last_login;
    }

    public void SetLast_login(String _last_login) {
        this.last_login = _last_login;
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void SetIsactive(Boolean _isactive) {
        this.isactive = _isactive;
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
