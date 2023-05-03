package com.bsuir.bookshop.service.impl;

import org.springframework.stereotype.Service;
import com.bsuir.bookshop.dao.GenreDao;
import com.bsuir.bookshop.entity.Genre;
import com.bsuir.bookshop.service.GenreService;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {
    private final GenreDao genreDao;

    public GenreServiceImpl(GenreDao genreDao) {
        this.genreDao = genreDao;
    }

    @Override
    public void createGenre(Genre genre) {
        genreDao.save(genre);
    }

    @Override
    public List<Genre> getGenres() {
        return genreDao.findAll();
    }

    @Override
    public Genre getGenreById(int genreId) {
        return genreDao.findById(genreId).get();
    }
}
