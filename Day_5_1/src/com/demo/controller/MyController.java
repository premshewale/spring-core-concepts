package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LoginData;

@Controller
public class MyController {
	
	public MyController() {
	System.out.println("MyController");
	}
	@RequestMapping("/")    		//url pattern
	public String showIndexPage(){
		System.out.println("showIndexPage");
		return "index";				//index.jsp
	}
	
	@RequestMapping("/login")    		//url pattern
	public String showLoginPage(){
		System.out.println("showLoginPage");
		return "login";				//login.jsp
	}
	
	@Autowired
	HttpServletRequest request;
	@RequestMapping("/validate")    		//url pattern
	public String validate(){
		System.out.println("Showvalidatepage");
		String user=request.getParameter("user");//accept data login.jsp
		String pass=request.getParameter("password");
		System.out.println(user+pass);
		
		if(user.equalsIgnoreCase("seed") && pass.equalsIgnoreCase("seed")){
			return "home";  		//home.jsp
		}
		
		return "index";				//login.jsp
	}
	
	
	
	@RequestMapping("/validate1")    		//url pattern
	public String validate1(@RequestParam("user") String user,@RequestParam("password") String pass){
		System.out.println("Showvalidate1page");
		
		System.out.println(user+pass);
		
		if(user.equalsIgnoreCase("seed") && pass.equalsIgnoreCase("seed")){
			return "home";  		//home.jsp
		}
		
		return "index";				//login.jsp
	}
	
	
	@RequestMapping("/validate2")    		//url pattern
	public String validate2(@ModelAttribute LoginData id, Model m){
		System.out.println("Showvalidate2page");
		
		System.out.println(id.getUser()+id.getPassword());
		
		if(id.getUser().equalsIgnoreCase("seed") && id.getPassword().equalsIgnoreCase("seed")){
			String msg="Hello "+id.getUser();
			m.addAttribute("message",msg);
			
			return "home";  		//home.jsp//view
		}else{
			String msg="Wrong Data ";
			m.addAttribute("message",msg);
		}		
		return "index";				//login.jsp//view
	}
	
	@RequestMapping("/loginvalidate")    		//url pattern
	public ModelAndView loginvalidate(@ModelAttribute LoginData id){
		System.out.println("Showloginvalidatepage");
		

		
		if(id.getUser().equalsIgnoreCase("seed") && id.getPassword().equalsIgnoreCase("seed")){
			String msg="Hello "+id.getUser();
			ModelAndView mv= new ModelAndView("home");
			mv.addObject("message",msg);
			
			return mv;  		//home.jsp//view
		}else{
			String msg="Wrong Data ";
			ModelAndView mv= new ModelAndView("index");
			mv.addObject("message",msg);
		
		return mv;				//login.jsp//view
	}}
	
	
	
	
}
	
	
	
	

