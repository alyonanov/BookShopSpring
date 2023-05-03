package com.bsuir.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bsuir.bookshop.entity.Genre;

public interface GenreDao extends JpaRepository<Genre, Integer> {
}
