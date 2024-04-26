package com.ctw.solid.single.bad;

public class UserMapper {

    private final UserAPI api = new UserAPI();

    public UserService.UserResponse mapUser(String name) {
        var user = this.api.findUserByName(name);

        return new UserService.UserResponse(user.name(), user.lastName(), user.age());
    }

}
