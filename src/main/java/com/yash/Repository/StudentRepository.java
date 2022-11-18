package com.yash.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.beans.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByStudentAge(Integer age);
	public List<Student> findByStudentAgeGreaterThanEqual(Integer age);
	
	public List<Student> findByStudentAgeIn(List<Integer> ages);
	
	public List<Student> findByStudentNameAndStudentAge(String name,Integer age);
	

}