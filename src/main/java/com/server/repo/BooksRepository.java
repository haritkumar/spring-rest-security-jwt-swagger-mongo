package com.server.repo;

import org.springframework.data.repository.CrudRepository;

import com.server.models.Book;

public interface BooksRepository extends CrudRepository<Book, String>{

}
