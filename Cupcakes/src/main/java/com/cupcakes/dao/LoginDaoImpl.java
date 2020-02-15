package com.cupcakes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cupcakes.vo.User;




public class LoginDaoImpl implements LoginDao {		
		
		//Uncomment the below lines to use JDBC instead of Hibernate
		/*
		 * String url="jdbc:mysql://localhost:3306/cupcakes";
		String u="root";
		String p="root";
		 * try { Class.forName("com.mysql.jdbc.Driver"); Connection
		 * con=DriverManager.getConnection(url,u,p); PreparedStatement
		 * ps=con.prepareStatement("Select * from login where uname=? and pass=?");
		 * ps.setString(1, uname); ps.setString(2, pass); ResultSet
		 * rs=ps.executeQuery(); if (rs.next()) { return true; } } catch (Exception e) {
		 * System.out.println(e); }
		 * 
		 */
	Configuration con=new Configuration().configure().addAnnotatedClass(User.class);
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	
	
	public boolean checkUser(String uname, String pass) {
		
		session.beginTransaction();
		Query q=session.createQuery("from User where uname=:uname and pass=:pass");
		q.setParameter("uname", uname);
		q.setParameter("pass", pass);
		List userList=q.list();
		if(userList.isEmpty()) {
			return false;
		}		
		return true;
	}
	
	public boolean saveUser(String fname,String gender,String uname,String pass) {
		
		User user=new User(fname,gender,uname,pass);
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		if(user.getUname()=="" || user.getUname()==null) {
			return false;
		}
		return true;
		
	}

}
