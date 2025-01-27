package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@DeleteMapping("/books/{i}")
	public ResponseEntity<Book> deleteBookHandler(@PathVariable("i") Integer id) {
		Book deletedBook = bookService.deleteBook(id);
		return new ResponseEntity<Book>(deletedBook, HttpStatus.OK);
	}
	
	@GetMapping("/books/{i}")
	public ResponseEntity<Book> getBookByIdHandler(@PathVariable("i") Integer id) {
		Book getBook = bookService.getBookById(id);
		return new ResponseEntity<Book>(getBook, HttpStatus.OK);
	}
}
