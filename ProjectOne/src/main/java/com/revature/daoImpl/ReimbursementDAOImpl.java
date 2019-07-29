package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.revature.beans.Reimbursement;
import com.revature.daos.ReimbursementDAO;
import com.revature.util.ConnFactory;

public class ReimbursementDAOImpl implements ReimbursementDAO{
	
	
	public static ConnFactory cf = ConnFactory.getInstance();

	public List<Reimbursement> getAllReimbursements() throws SQLException {
			List<Reimbursement> listOfReimbursement = new ArrayList<Reimbursement>();
			Connection conn = cf.getConnection();
			String sql = "SELECT * REIMBURSEMENT";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Reimbursement reimbursement = null;
			
			while (rs.next()) {
				reimbursement = new Reimbursement(rs.getInt(2), rs.getDouble(3), rs.getString(4), rs.getInt(6), rs.getInt(7),rs.getInt(8));
				reimbursement.setReimbursementID(rs.getInt(1));
				listOfReimbursement.add(reimbursement);
			}
		return listOfReimbursement;
	}

	

		
		public static void addReimbursement(int reiID, Double amount, String reason, int monkID) throws SQLException {
				

			String sql = "INSERT INTO REIMBURSEMENT VALUES(?,?,?,?,?)";
			
			Connection conn = cf.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, reiID);

			ps.setString(2, "pending");
			
			

			ps.setDouble(3, amount );
			
			ps.setString(4, reason);

			ps.setInt(5, monkID);

			ps.executeUpdate();
		
		}		
	

	public void removeReimbusement(int reimbursementID) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "DELETE FROM REIMBURSEMENT WHERE REI_ID";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, reimbursementID);
		
	}

	public List<Reimbursement> getReimbursementByMonkeeyID(int ID) throws SQLException {
		
		List<Reimbursement> listOfReimbursement = new ArrayList<Reimbursement>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENT WHERE MONKEEY_ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ID);
		ResultSet rs = ps.executeQuery();
		
		Reimbursement reimbursement = null;
		while (rs.next()) {
			reimbursement = new Reimbursement(rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(6), rs.getInt(7),rs.getInt(8));
			reimbursement.setReimbursementID(rs.getInt(1));
			listOfReimbursement.add(reimbursement);
		}
		return listOfReimbursement;
		
	}

	public void updateReimbursement(Reimbursement reimbursement) throws SQLException {
		Connection conn = cf.getConnection();
		String sql ="UPDATE REIMBURSEMENT SET STATUS = ?,ACCEPTED_BY = ?  WHERE REI_ID = ?" ;
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, reimbursement.getStatus());
		ps.setInt(2, reimbursement.getAcceptedBy());
		ps.setInt(3, reimbursement.getReimbursementID());
		ps.executeUpdate();
		
	}
	
	public List<Reimbursement> getReimbursementByDepartment(int departmentID) throws SQLException {
		List<Reimbursement> listOfReimbursement = new ArrayList<Reimbursement>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM REIMBURSEMENT WHERE DEP_ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, departmentID);
		ResultSet rs = ps.executeQuery();
		
		Reimbursement reimbursement = null;
		while (rs.next()) {
			reimbursement = new Reimbursement(rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(6), rs.getInt(7),rs.getInt(8));
			reimbursement.setReimbursementID(rs.getInt(1));
			listOfReimbursement.add(reimbursement);
		}
		return listOfReimbursement;
	}




	public void addReimbursement(Reimbursement reimbursement) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
