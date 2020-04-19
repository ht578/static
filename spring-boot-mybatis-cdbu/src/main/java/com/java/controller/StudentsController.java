package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.pojo.Students;
import com.java.service.StudentsService;
/**
 * controller类
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/students")
public class StudentsController {
	@Autowired
	private StudentsService studentsService;
	
	/**
	 * 页面跳转
	 */
	@RequestMapping("/{page}")
	public String skip(@PathVariable String page) {
		return page;
	}
	/**
	 * 添加用户
	 * @param students
	 * @return
	 */
	
	@RequestMapping("/addStudents")
	public String addStudents(Students students) {
		this.studentsService.addStudents(students);
		return "redirect:/students/findAllStudents";
	}
	/**
	 * 查询用户
	 * @param model
	 * @return
	 */
	
	@RequestMapping("/findAllStudents")
	public String findAllStudents(Model model) {
		List<Students> list = this.studentsService.findAllStudens();
		model.addAttribute("list", list);
		return "showAll";
	}
	/**
	 * 更新用户并回响
	 */
	@RequestMapping("/findAllStudentsById")
	public String findAllStudentsById(Model model,Integer id){
		Students student = this.studentsService.findAllStudentsById(id);
		model.addAttribute("student",student);
		return "update";
	}
	
	@RequestMapping("/updateStudents")
	public String updateStudents(Students students) {
		this.studentsService.updateStudents(students);
		return "redirect:/students/findAllStudents";
	}
	
	@RequestMapping("/delStudents")
	public String delStudents(Integer id) {
		this.studentsService.delStudents(id);
		return "redirect:/students/findAllStudents";
	}
}








