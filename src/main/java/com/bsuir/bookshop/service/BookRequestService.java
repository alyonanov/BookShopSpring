package com.bsuir.bookshop.service;

import com.bsuir.bookshop.entity.BookRequest;

import java.util.List;

public interface BookRequestService {
    void createRequest(BookRequest bookRequest);

    List<BookRequest> getBookRequests();

    List<BookRequest> getBookRequestsByCount();

    List<BookRequest> getBookRequestsByAlph();

}
