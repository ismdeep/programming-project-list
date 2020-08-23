package com.ismdeep.restservice.controller;

import com.ismdeep.restservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class UserController {

    @GetMapping("/users")
    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1, "admin", "Administrator"));
        users.add(new User(2, "ismdeep", "Del Cooper"));
        return users;
    }
}
