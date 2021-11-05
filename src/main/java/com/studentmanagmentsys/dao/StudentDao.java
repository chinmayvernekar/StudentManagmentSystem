package com.studentmanagmentsys.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagmentsys.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long>{

	
}
