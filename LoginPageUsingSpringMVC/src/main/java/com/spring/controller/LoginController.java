package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController {
	    @RequestMapping("/hello")
		public ModelAndView hello(HttpServletRequest request ,HttpServletResponse response) 
	    {
	    	String name=request.getParameter("name");
	    	String password=request.getParameter("pass");
	    	if(password.equals("admin")){
	    		String message = "Welcome "+name;
	    		return new ModelAndView("hellopage","message",message);
	    	}
	    	else {
	    		return new ModelAndView("error","message","Invalid Password");
	    	}
	    	
	    }
}
