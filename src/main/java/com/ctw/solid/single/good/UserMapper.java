package com.ctw.solid.single.good;

import com.ctw.solid.single.User;

public class UserMapper {

    public UserService.UserResponse mapUser(User user) {

        return new UserService.UserResponse(user.name(), user.lastName(), user.age());
    }

}
