package com.bsuir.bookshop.service.impl;

import org.springframework.stereotype.Service;
import com.bsuir.bookshop.dao.UserDao;
import com.bsuir.bookshop.entity.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements  com.bsuir.bookshop.service.UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao UserDao) {
        this.userDao = UserDao;
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        Optional<User> user = userDao.findByUsername(username);
        if (user.isEmpty()) {
            return null;
        } else {
            return user.get();
        }
    }

}
