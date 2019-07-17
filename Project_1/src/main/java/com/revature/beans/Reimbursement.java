package com.revature.beans;

public class Reimbursement {
	
	private int reiID;
	private int userID;
	private double amount;
	private String status;
	
	public Reimbursement(int reiID, int userID, double amount, String status) {
		super();
		this.reiID = reiID;
		this.userID = userID;
		this.amount = amount;
		this.status = status;
	}

	public int getReiID() {
		return reiID;
	}

	public void setReiID(int reiID) {
		this.reiID = reiID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reimbursement [reiID=" + reiID + ", userID=" + userID + ", amount=" + amount + ", status=" + status
				+ "]";
	}
	
	

}
