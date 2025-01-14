package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Book;
import com.masai.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBookHandler(@RequestBody Book book) {
		Book addBook = bookService.addBooks(book);
		return new ResponseEntity<Book>(addBook, HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooksHandler(){
		List<Book> getAllBooks = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(getAllBooks, HttpStatus.OK);
	}
}
