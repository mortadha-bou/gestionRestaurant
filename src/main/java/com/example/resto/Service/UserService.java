package com.example.resto.Service;

import com.example.resto.Entity.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    // get User
    List<User> getAllUser();

    //get user by id
    User getUserById(int id);
    //get user by login and password
    User getUserByLoginPassword(String email,String password);
    // Update User
    User updateUser (User user);

    // Delete User
    void deleteUserById(Integer Id);
}
