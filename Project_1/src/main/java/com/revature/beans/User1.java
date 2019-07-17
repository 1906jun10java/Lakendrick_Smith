package com.revature.beans;

public class User1 {
	
	private int userID;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	private String emp_Type;
	
	
	public User1(int userID, String firstName, String lastName, String userName, String passWord, String emp_Type) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.emp_Type = emp_Type;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getEmp_Type() {
		return emp_Type;
	}


	public void setEmp_Type(String emp_Type) {
		this.emp_Type = emp_Type;
	}


	@Override
	public String toString() {
		return "User1 [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", passWord=" + passWord + ", emp_Type=" + emp_Type + "]";
	}

}	