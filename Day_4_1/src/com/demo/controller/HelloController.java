package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.MathOperation;

@Controller
public class HelloController {
	
	public HelloController (){
		System.out.println("in HelloController ...");
	}
	
	@RequestMapping("/")
	public String getIndex(){
		return "index";	
	}
	
	@RequestMapping("/AddIt")
	public ModelAndView getResult(HttpServletRequest request,HttpServletResponse response){
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int total=MathOperation.addition(n1, n2);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",total);
		
		return mv;	
	}
}
