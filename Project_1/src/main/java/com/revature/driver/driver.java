package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoImpl.ReimbursementDAOImpl;
import com.revature.daoImpl.User1DAOImpl;
public class driver {

	public static void main(String[] args) {
		
		 try {
			System.out.println(User1DAOImpl. getUser1List());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}