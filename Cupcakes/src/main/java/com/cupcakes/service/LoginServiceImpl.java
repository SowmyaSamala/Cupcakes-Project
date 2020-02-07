package com.cupcakes.service;

import com.cupcakes.dao.Logindao;
import com.cupcakes.dao.LogindaoImpl;

public  class LoginServiceImpl implements LoginService{

	public boolean loginServiceMethod(String uname,String pass) {
		Logindao ld=new LogindaoImpl();
		if(ld.checkUser(uname, pass)) {
			return true;
		}


		return false;
	}

	
	
	
	
	

}
