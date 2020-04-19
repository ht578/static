package com.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.mapper.StudentsMapper;
import com.java.pojo.Students;
import com.java.service.StudentsService;


/**
 * 业务层实现类
 * @author Administrator
 *
 */
@Service
@Transactional
public class StudentsServiceImpl implements StudentsService {
	@Autowired
	private StudentsMapper studentsMapper;
	
	@Override
	public void addStudents(Students students) {
		this.studentsMapper.addStudents(students);
	}

	@Override
	public List<Students> findAllStudens() {
		List<Students> list = this.studentsMapper.selectStudents();
		return list;
	}

	@Override
	public Students findAllStudentsById(Integer id) {
		Students students = this.studentsMapper.selectStudentsById(id);
		return students;
	}

	@Override
	public void updateStudents(Students students) {
		this.studentsMapper.updateStudents(students);
	}

	@Override
	public void delStudents(Integer id) {
		this.studentsMapper.delStudents(id);
	}

}
