package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import com.fasterxml.jackson.core.format.InputAccessor.Std;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	// To retrieve all student details
	public List<Student> listAll() {
		return repo.findAll();
	}

	// To perform update operation
	public Student get(long id) {
		return repo.findById(id).get();
	}

	// To delete
	public void delete(long id) {
		repo.deleteById(id);
	}

	public void save(Student std) {
		repo.save(std);
	}
}
