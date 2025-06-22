package com.example.Goodreads.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Goodreads.service.*;
import com.example.Goodreads.model.*;
import java.util.*;

@RestController
public class BookController {
	 BookService bookService = new BookService();
	 
	 @GetMapping("/books")
	    public ArrayList<Book> getBooks() {
	        return bookService.getBooks();
	    }

}
