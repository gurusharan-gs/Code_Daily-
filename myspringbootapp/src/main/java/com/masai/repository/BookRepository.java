package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Book;

@org.springframework.stereotype.Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
