package com.exercise.controller;

import com.exercise.model.User;
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
        users.add(new User("Enrique", "enrique@dominio.com","Enrique123"));
        users.add(new User("Thaily", "thaily@dominio.com","Thaily789"));
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @PostMapping
    @ResponseBody
    public Message addUser(@RequestBody User _user) {
        //user u = new (_user.GetTitle(), _user.getEmail(), _user.getPassword());
        users.add(_user);
        Message msg = new Message("Usuario agregado con Exito!");
        return msg;
    }

    @DeleteMapping("/{_index}")
    public void deleteUser(@PathVariable int _index) {
        users.remove(_index);
    }
}