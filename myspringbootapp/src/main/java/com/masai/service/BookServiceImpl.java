package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Book;
import com.masai.exception.BookException;
import com.masai.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book addBooks(Book book) {
		Book saveBook = bookRepository.save(book);
		return saveBook;
	}

	@Override
	public List<Book> getAllBooks() throws BookException {
		List<Book> bookList = bookRepository.findAll();
		if(bookList.size() == 0) {
			throw new BookException("Books not avalible..");
		}else {
			return bookList;
		}
		
	}



}
