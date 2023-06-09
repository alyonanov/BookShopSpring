package com.bsuir.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bsuir.bookshop.entity.BookOrderProduct;

import java.util.List;
import java.util.Optional;

public interface BookOrderProductDao extends JpaRepository<BookOrderProduct, Integer> {
    Optional<List<BookOrderProduct>> findByBookOrderId(int id);
    Optional<BookOrderProduct> findByBookIdAndBookOrderId(int bookId, int bookOrderId);
}
