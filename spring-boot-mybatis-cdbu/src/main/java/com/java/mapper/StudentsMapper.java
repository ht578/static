package com.java.mapper;

import java.util.List;

import com.java.pojo.Students;
/**
 * mapper接口
 * @author Administrator
 *
 */
public interface StudentsMapper {
	void addStudents(Students students);
	
	List<Students> selectStudents();
	
	Students selectStudentsById(Integer id);
	
	void updateStudents(Students students);
	
	void delStudents(Integer id);
}
