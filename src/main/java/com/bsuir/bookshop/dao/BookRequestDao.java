package com.bsuir.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bsuir.bookshop.entity.Author;
import com.bsuir.bookshop.entity.Book;
import com.bsuir.bookshop.entity.BookRequest;

import java.util.List;

public interface BookRequestDao extends JpaRepository<BookRequest, Integer> {
}
