package com.ctw.solid.single.good;

public class UserService {

    private final UserAPI api = new UserAPI();

    public static void main(String[] args) {
        UserService instance = new UserService();

        var res = instance.getUserResponse("this is a name");

        System.out.println(res);
    }

    private UserResponse getUserResponse(String name) {
        var user = api.findUserByName(name);
        return new UserMapper().mapUser(user);
    }


    public record UserResponse(String name, String lastName, int age) {}
}
