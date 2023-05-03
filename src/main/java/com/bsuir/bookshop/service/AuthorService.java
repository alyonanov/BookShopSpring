package com.bsuir.bookshop.service;

import com.bsuir.bookshop.entity.Author;

import java.util.List;

public interface AuthorService {
    void addAuthor(Author author);
    Author getAuthorById(int id);
    List<Author> getAuthors();
}
