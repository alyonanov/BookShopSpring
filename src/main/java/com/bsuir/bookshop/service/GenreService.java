package com.bsuir.bookshop.service;

import com.bsuir.bookshop.entity.Genre;

import java.util.List;

public interface GenreService {
    void createGenre(Genre genre);

    List<Genre> getGenres();

    Genre getGenreById(int genreId);
}
