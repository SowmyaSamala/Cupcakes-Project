package com.cupcakes.service;

import com.cupcakes.dao.LoginDao;
import com.cupcakes.dao.LoginDaoImpl;

public  class LoginServiceImpl implements LoginService{

	public boolean loginServiceMethod(String uname,String pass) {
		LoginDao ld=new LoginDaoImpl();
		if(ld.checkUser(uname, pass)) {
			return true;
		}


		return false;
	}

	
	
	
	
	

}
