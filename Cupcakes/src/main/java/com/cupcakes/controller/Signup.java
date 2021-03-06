package com.cupcakes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cupcakes.service.LoginService;
import com.cupcakes.service.LoginServiceImpl;

@Controller
public class Signup {
	
	@ExceptionHandler(Exception.class)
	@RequestMapping("/signup")
	public ModelAndView userSignup(@RequestParam("fname") String fname,@RequestParam("gender") String gender,@RequestParam("uname") String uname,@RequestParam("pass") String pass, HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		//Uncomment below lines if you don't use RequestParam annotation
		/* 
		 * String uname=req.getParameter("uname"); String pass=req.getParameter("pass");
		 */
		LoginService ls=new LoginServiceImpl();		
		if(ls.loginServiceMethod(uname, pass)) {
			mv.setViewName("alreadyRegistered.jsp");			
		}else if (ls.signupServiceMethod(fname, gender, uname, pass)) {
			mv.setViewName("signupSuccess.jsp");
		}
		else {
			mv.setViewName("Failure.jsp");
		}
		
		return mv ;
	}
}
