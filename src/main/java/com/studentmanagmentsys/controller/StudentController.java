package com.studentmanagmentsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagmentsys.dao.StudentDao;
import com.studentmanagmentsys.model.Student;
import com.studentmanagmentsys.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentDao studentDao;
	
	@Autowired
	StudentService studentService;
	
	//OK WORKING
	@PostMapping
	public void addStudent(@RequestBody Student student)
	{
		studentDao.save(student);
	}
	
	//OK Working
	@GetMapping
	public List<Student> findAll(){
		
		return studentService.findStudents();
	}
	
	@RequestMapping(value = "/deleteStudent/{sid}" , method = RequestMethod.DELETE)
	public void deleteS(@PathVariable("sid") Long sid) {
		studentService.deleteStudent(sid);
	}
	
}
