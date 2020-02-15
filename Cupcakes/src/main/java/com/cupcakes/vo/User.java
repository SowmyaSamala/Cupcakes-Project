package com.cupcakes.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	private String uname;
	private String fname;
	private String gender;	
	private String pass;
	
	@Override
	public String toString() {
		return "User [fname=" + fname + ", gender=" + gender + ", uname=" + uname + ", pass=" + pass + "]";
	}
	
	public User(String fname,String gender,String uname,String pass) {
		this.fname=fname;
		this.gender=gender;
		this.uname=uname;
		this.pass=pass;
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String string) {
		this.pass = string;
	}
	
	
	
	
	

}
