package com.revature.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.daoImpl.ReimbursementDAOImpl;

public class ReimbursementService {

ReimbursementDAOImpl reimbursementService = new ReimbursementDAOImpl();
	
	public boolean generateReimbursement(Reimbursement reimbursement) {
		try {
			reimbursementService.addReimbursement(reimbursement);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Reimbursement> getRequestsByMonkeeyID(int ID){
		
		List<Reimbursement> tempList = new ArrayList<Reimbursement>();
		try {
			tempList.addAll(reimbursementService.getReimbursementByMonkeeyID(ID));
			return tempList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Reimbursement> getByDptId(int id){
		List<Reimbursement> tempList = new ArrayList<Reimbursement>();
		try {
			tempList.addAll(reimbursementService.getReimbursementByDepartment(id));
			return tempList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void approveReimbursement(int reid, int empId) {
		List<Reimbursement> tempList = new ArrayList<Reimbursement>();
		try {
			tempList.addAll(reimbursementService.getAllReimbursements());
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Reimbursement target = null;
		for(Reimbursement rr :tempList) {
			if(rr.getReimbursementID() == reid) {
				target = rr;
			}
		}
		if(target == null) {
			return;
		}
		target.setAcceptedBy(empId);
		target.setStatus(2);
		try {
			reimbursementService.updateReimbursement(target);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void rejectReimbursement(int reid, int empId) {
		List<Reimbursement> tempList = new ArrayList<Reimbursement>();
		try {
			tempList.addAll(reimbursementService.getReimbursementByMonkeeyID(empId));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		Reimbursement target = null;
		for(Reimbursement r :tempList) {
			if(r.getReimbursementID() == reid) {
				target = r;
			}
		}
		if(target == null) {
			return;
		}
		target.setAcceptedBy(empId);
		target.setStatus(3);
		try {
			reimbursementService.updateReimbursement(target);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Reimbursement> getAllReimbursementRequests(){
		List<Reimbursement> tempList = new ArrayList<Reimbursement>();
		try {
			tempList.addAll(reimbursementService.getAllReimbursements());
			return tempList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	public boolean generateReimbursement1(Reimbursement r) {
		try {
			reimbursementService.addReimbursement(r);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	
	
}
}