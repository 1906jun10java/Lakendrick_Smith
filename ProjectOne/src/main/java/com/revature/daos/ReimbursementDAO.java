package com.revature.daos;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Reimbursement;

public interface ReimbursementDAO {
	
	public List<Reimbursement> getAllReimbursements() 
	throws SQLException;
	
	public List<Reimbursement> getReimbursementByDepartment(int departmentID)
	throws SQLException;
	
	public void addReimbursement(Reimbursement reimbursement)
	throws SQLException;
	
	public void removeReimbusement(int reimbursementID)
	throws SQLException;
	
	public List<Reimbursement> getReimbursementByMonkeeyID(int ID)
	throws SQLException;

	void updateReimbursement(Reimbursement reimbursement) throws SQLException;

}