package com.cupcakes.dao;

public interface LoginDao {
	
	public boolean checkUser(String uname, String pass);
	public boolean saveUser(String fname,String gender,String uname,String pass);

}
