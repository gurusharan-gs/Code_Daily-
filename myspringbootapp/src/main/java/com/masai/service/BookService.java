package com.masai.service;

import java.util.List;

import com.masai.entity.Book;
import com.masai.exception.BookException;

public interface BookService {

	public Book addBooks(Book book);
	
	public List<Book> getAllBooks()throws BookException;
	
	
}
