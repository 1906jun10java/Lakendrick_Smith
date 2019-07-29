package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Monkeey;
import com.revature.daos.MonkeeyDAO;
import com.revature.util.ConnFactory;

public class MonkeeyDAOImpl implements MonkeeyDAO {
	
	
	//will use ConnFactory to get a connection to our database to be use by all methods.
	public static ConnFactory cf = ConnFactory.getInstance();
	
	
	public List<Monkeey> getAllMonkeeys() throws SQLException {
		
		List<Monkeey> listOfMonkeeys = new ArrayList<Monkeey>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM MONKEEY";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		Monkeey monkeey = null;
		while(rs.next()) {
			monkeey = new Monkeey(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7), rs.getInt(8), rs.getInt(9));
			monkeey.setMonkeeyID(rs.getInt(1));
			listOfMonkeeys.add(monkeey);
		}
		return listOfMonkeeys;
	}
		//This method will return a monkeey matching its ID
	public Monkeey getMonkeey(String username) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM MONKEEY WHERE USERNAME = ? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		Monkeey monkeey = null;
		
		//while the result set still has values, return a monkeey
		while(rs.next()) {
			
			monkeey = new Monkeey(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),
					rs.getString(6),rs.getString(7), rs.getInt(8), rs.getInt(9));
			
			monkeey.setMonkeeyID(rs.getInt(1));
		
	}
return monkeey;
	}
	
	public void updateMonkeeys(Monkeey monkeey) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql ="UPDATE MONKEEY SET USERNAME = ?,PASSWORD = ?, EMAIL = ? WHERE MONKEEY_ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1,monkeey.getUserName());
		
		ps.setString(2, monkeey.getPassword());
		
		ps.setString(3, monkeey.getEmail() );
		
		ps.setInt(4,monkeey.getMonkeeyID());
	}

	public void removeMonkeey(int ID) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "DELETE FROM MONKEEY WHERE MONKEEY_ID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ID);
		
		ps.executeUpdate();
	}
	 //This method will add a new monkeey to the database
	public void addMonkeeys(Monkeey monkeey) throws SQLException {
		
		
		
		
		
	}

}
