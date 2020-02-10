package com.cupcakes.vo;

import java.math.BigInteger;
import java.util.Arrays;

public class UserVo {
	
	private String fname;
	private String gender;
	private String email;
	private BigInteger phn;
	private String uname;
	private char[] pass;
	
	@Override
	public String toString() {
		return "UserVo [fname=" + fname + ", gender=" + gender + ", email=" + email + ", phn=" + phn + ", uname="
				+ uname + ", pass=" + Arrays.toString(pass) + "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getPhn() {
		return phn;
	}
	public void setPhn(BigInteger phn) {
		this.phn = phn;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public char[] getPass() {
		return pass;
	}
	public void setPass(char[] pass) {
		this.pass = pass;
	}
	
	
	
	
	

}
