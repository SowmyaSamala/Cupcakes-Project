package com.cupcakes.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cupcakes.service.LoginService;
import com.cupcakes.service.LoginServiceImpl;

@Controller
public class Login {
	
	@RequestMapping("/login")
	public ModelAndView userLogin(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		LoginService ls=new LoginServiceImpl();
		
		if (ls.loginServiceMethod(uname, pass)) {
			mv.setViewName("loginSuccess.jsp");
		}
		else {
			mv.setViewName("index.jsp");
		}
		
		return mv ;
		
	}

}
