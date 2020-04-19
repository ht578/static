package com.java.service;

import java.util.List;

import com.java.pojo.Students;
/**
 * 业务层接口
 * @author Administrator
 *
 */
public interface StudentsService {
	void addStudents(Students students);
	
	List<Students> findAllStudens();
	
	Students findAllStudentsById(Integer id);
	
	void updateStudents(Students students);
	
	void delStudents(Integer id);
}
