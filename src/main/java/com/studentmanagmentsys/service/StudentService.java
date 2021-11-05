package com.studentmanagmentsys.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagmentsys.dao.StudentDao;
import com.studentmanagmentsys.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	Student student;
	
	//Finding All the Student in Database
	public List<Student> findStudents() {

		var find = studentDao.findAll();

		var students = new ArrayList<Student>();

		find.forEach(e -> students.add(e));

		return students;
	}
	
	public void deleteStudent(Long sid) {
		
		studentDao.deleteById(sid);
	}
	
	
	
}
