package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Employee;
import com.demo.service.EmployeeService;


@Controller
public class HelloController {
	
	public HelloController (){
		System.out.println("in HelloController ...");
	}
	
	@RequestMapping("/")
	public String getIndex(){
		return "index";	
	}
	
	
	@RequestMapping("/addEmployee")
	public String getAddEmp(){
		return "AddEmp";
	}
	
	@RequestMapping("/validate")
	public ModelAndView addEmpInDB(@ModelAttribute Employee emp){
		System.out.println(emp);
		ModelAndView mv = new ModelAndView("home");
		EmployeeService es= new EmployeeService();
		int i=es.addEmp(emp);
		if(i==1){
			mv.addObject("message","Record added Successfully");
			return mv;   //home.jsp -- Record added successfully
		}else{
			mv.addObject("message","Error Occured..");
			return mv;
		}
	
		
	}
	
}
