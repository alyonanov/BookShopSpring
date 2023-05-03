package com.bsuir.bookshop.service;

import com.bsuir.bookshop.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUserById(int id);

    List<User> getUsers();

    User getUserByUsername(String username);
}
