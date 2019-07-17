package com.revature.daoImpl;

import com.revature.beans.User1;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.revature.utility.ConnFactory;

public class User1DAOImpl {

	public static ConnFactory cf = ConnFactory.getInstance();

	private static Connection conn = cf.getConnection();

	public static List<User1> getUser1List() throws SQLException {

		String sql = "SELECT * FROM USER1";

		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		List<User1> user = new ArrayList<User1>();

		if (!rs.isBeforeFirst()) {

			return null;

		}

		while (rs.next()) {

			User1 person = new User1(0, sql, sql, sql, sql, sql);

			person.setUserID(rs.getInt("USER_ID"));

			person.setFirstName(rs.getString("FIRSTNAME"));

			person.setLastName(rs.getString("LASTNAME"));

			person.setUserName(rs.getString("USERNAME"));

			person.setPassWord(rs.getString("PASSWORD"));

			person.setEmp_Type(rs.getString("EMP_TYPE"));

			user.add(person);

			System.out.println("");

		}
		return user;
	}

	public static void createUser(int userID, String firstName, String lastName, String userName, String passWord,

			String emp_Type) throws SQLException {

		String sql = "INSERT INTO USER1 VALUES(?,?,?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, userID);

		ps.setString(2, firstName);

		ps.setString(3, lastName);

		ps.setString(4, userName);

		ps.setString(5, passWord);

		ps.setString(6, emp_Type);

		ps.executeUpdate();

	}

}
