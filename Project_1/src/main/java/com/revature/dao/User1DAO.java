package com.revature.dao;

 
import com.revature.beans.User1;

import java.sql.SQLException;

import java.util.List;

public interface User1DAO {
	

	public abstract void createUser(int userID, String firstName, String lastName, String userName, String passWord, int emp_Type_ID) throws SQLException;  
	
		
	public abstract List<User1> getUser1List() throws SQLException;

}
