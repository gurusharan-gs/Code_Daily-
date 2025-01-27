package com.masai.service;

import java.util.List;

import com.masai.entity.Book;
import com.masai.exception.BookException;

public interface BookService {

	public Book addBooks(Book book);
	
	public List<Book> getAllBooks()throws BookException;
	
	public Book deleteBook(Integer id)throws BookException;
	
	public Book getBookById(Integer id)throws BookException;
	
	
	
}
