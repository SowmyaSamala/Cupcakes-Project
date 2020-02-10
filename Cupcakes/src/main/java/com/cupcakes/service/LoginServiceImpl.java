package com.cupcakes.service;

import com.cupcakes.dao.LoginDao;
import com.cupcakes.dao.LoginDaoImpl;

public  class LoginServiceImpl implements LoginService{

	public boolean loginServiceMethod(String uname,String pass) {
		LoginDao ld1=new LoginDaoImpl();
		if(ld1.checkUser(uname, pass)) {
			return true;
		}
		return false;
	}
	
	public boolean signupServiceMethod(String fname,String gender,String uname,String pass) {
		LoginDao ld2=new LoginDaoImpl();
		if(ld2.saveUser(fname, gender, uname, pass)) {
			return true;
		}
		return false;
	}

	
	
	
	
	

}
