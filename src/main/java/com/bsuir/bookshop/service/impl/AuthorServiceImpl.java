package com.bsuir.bookshop.service.impl;

import org.springframework.stereotype.Service;
import com.bsuir.bookshop.dao.AuthorDao;
import com.bsuir.bookshop.entity.Author;
import com.bsuir.bookshop.service.AuthorService;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public void addAuthor(Author author) {
        authorDao.save(author);
    }

    @Override
    public Author getAuthorById(int id) {
        return authorDao.findById(id).get();
    }

    @Override
    public List<Author> getAuthors() {
        return authorDao.findAll();
    }
}
