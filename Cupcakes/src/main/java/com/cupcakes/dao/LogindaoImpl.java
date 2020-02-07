package com.cupcakes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LogindaoImpl implements Logindao {


	public boolean checkUser(String uname, String pass) {
		String url="jdbc:mysql://localhost:3306/cupcakes";
		String u="root";
		String p="root";
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,u,p);
			PreparedStatement ps=con.prepareStatement("Select * from login where uname=? and pass=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}


		return false;
	}

}
