package com.bsuir.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bsuir.bookshop.entity.Author;

import java.util.List;

public interface AuthorDao extends JpaRepository<Author, Integer> {
}
