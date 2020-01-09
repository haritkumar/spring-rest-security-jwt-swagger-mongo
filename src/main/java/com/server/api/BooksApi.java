package com.server.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.server.models.Book;
import com.server.repo.BooksRepository;

@RestController
@RequestMapping("/api/books")
public class BooksApi {

	@Autowired
	BooksRepository booksRepository;

    @RequestMapping(method=RequestMethod.GET)
    public Iterable<Book> books() {
        return booksRepository.findAll();
    }
	
	
}
