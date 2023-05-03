package com.bsuir.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bsuir.bookshop.entity.User;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
