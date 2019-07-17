package com.revature.daoImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.beans.User1;
import com.revature.utility.ConnFactory;

public class ReimbursementDAOImpl {

	public static ConnFactory cf = ConnFactory.getInstance();

	private static Connection conn = cf.getConnection();

	public List<Reimbursement> getReimbursementList() throws SQLException {
	
		 String sql = "SELECT * FROM REIMBURSEMENT_REQUEST";

	        PreparedStatement ps = conn.prepareStatement(sql);
	        
	        ResultSet rs = ps.executeQuery();

	        List<Reimbursement> request = new ArrayList<Reimbursement>();
	        
	        if (!rs.isBeforeFirst()) {

				return null;

			}
	        while (rs.next()) {

				Reimbursement money = new Reimbursement(0, 0, 0, sql);

				money.setReiID(rs.getInt("REI_ID"));

				money.setAmount(rs.getDouble("AMOUNT"));

				money.setStatus(rs.getString("STATUS"));

				money.setUserID(rs.getInt("USER_ID"));

				
				request.add(money);

				System.out.println("");

			}
			return request;
		}
	public static void createReimbursement(int reiID, Double amount, int userID)
			throws SQLException {

		String sql = "INSERT INTO REIMBURSEMENT_REQUEST VALUES(?,?,?,?)";

		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, reiID);

		ps.setDouble(2, amount);
		
		

		ps.setString(3, "pending" );

		ps.setInt(4, userID);

		ps.executeUpdate();

	}
	
	public static void acceptReimbursement(int userID, int reiID) throws SQLException {
		
		String sql = "INSERT INTO RESOLVED_REQUEST VALUES(?,?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, userID);
		ps.setInt(2, reiID);
		ps.executeUpdate();
	}
	
}

