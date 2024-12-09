package com.masai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.entity.Student;
import com.masai.exception.StudentException;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public List<Student> findByAddress(String address);
	
	public Optional<Student> findByMarks(int marks);
	
	public List<Student> findByMarksLessThan(int marks);
	
//	@Query("select s.name from Student s where s.rollNo=:r ")
//	public String getStudentNameByRoll(@Param("r") int rollNo);
	
	@Query("select s.name from Student s where s.rollNo=?1 ")
	public String getStudentNameByRoll(int rollNo);
	
	@Query("select s.name, s.marks from Student s where s.address=?1")
	public List<String> getStudentNameAndMarksByAddress(String address);

}
