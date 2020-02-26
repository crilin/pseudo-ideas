package com.exercise.controller;

import com.exercise.model.User;
import com.exercise.model.Phone;
import com.exercise.model.Message;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User("Enrique", "enrique@dominio.com", "Enrique123",new ArrayList<>(Array.isList(new Phone("27786211","11","054"),new Phone("3648727","212","058")))));
        users.add(new User("Thaily", "ninaly8@dominio.com", "Thaily123",new ArrayList<>(Array.isList(new Phone("3213508","212","058")))));
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    @ResponseBody
    public Message addUser(@RequestBody User _user) {
        Message msg;
        if (!_user.isPassValid()) {
        
            msg = new Message("La contraseña debe contener: 'Una letra Mayuscula, letras minúsculas, y dos numero'");
            return msg;
        }

        if (!_user.isEmailValid()) {
            msg = new Message("El correo tiene que cumplir con el formato: 'aaaaaaa@dominio.cl'");
            return msg;   
        }

        users.add(_user);
        msg  = new Message("El usuario: " + _user.getTitle() + " ha sido agregado");
        return msg;

    }

    @DeleteMapping("/{_index}")
    public Message deleteUser(@PathVariable int _index) {
        Message msg;
        User user = users.get(_index);
        msg = new Message("El usuario: " + user.getTitle() + " Have been remove");
        users.remove(_index);
        return msg;
    }
}