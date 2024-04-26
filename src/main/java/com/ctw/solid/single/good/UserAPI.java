package com.ctw.solid.single.good;

import com.ctw.solid.single.User;

public class UserAPI {

    public User findUserByName(String name) {
        return new User(name, "last name", 20);
    }
}
