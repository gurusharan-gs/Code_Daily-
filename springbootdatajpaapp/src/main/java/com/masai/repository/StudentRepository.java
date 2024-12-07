package com.masai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByAddress(String address);
	
	public Optional<Student> findByMarks(int marks);
	
	public List<Student> findByMarksLessThan(int marks);

}
