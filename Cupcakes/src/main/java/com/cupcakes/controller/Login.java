package com.cupcakes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cupcakes.service.LoginService;
import com.cupcakes.service.LoginServiceImpl;

@Controller
public class Login {
	
	@RequestMapping("/login")
	public ModelAndView userLogin(@RequestParam("uname") String uname,@RequestParam("pass") String pass, HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		//Uncomment below lines if you don't use RequestParam annotation
		/* 
		 * String uname=req.getParameter("uname"); String pass=req.getParameter("pass");
		 */
		LoginService ls=new LoginServiceImpl();
		
		if (ls.loginServiceMethod(uname, pass)) {
			mv.setViewName("loginSuccess.jsp");
		}
		else {
			mv.setViewName("Failure.jsp");
		}
		
		return mv ;
		
	}
	
	@RequestMapping("/signupLink")
	public ModelAndView linkSignup() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("signup.jsp");
		return mv;
	}

}
