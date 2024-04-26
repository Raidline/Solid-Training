package com.ctw.solid.single.good;

public class UserService {

    public static void main(String[] args) {
        UserService instance = new UserService();

        var res = instance.getUserResponse("this is a name");

        System.out.println(res);
    }

    private UserResponse getUserResponse(String name) {
        return new UserMapper().mapUser(name);
    }


    public record UserResponse(String name, String lastName, int age) {}
}
