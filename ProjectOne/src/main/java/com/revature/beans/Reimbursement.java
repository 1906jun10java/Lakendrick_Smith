package com.revature.beans;

public class Reimbursement {

	private int reimbursementID;
	private int monkeeyID;
	private	double Amount;
	private String reason;
	
	private int status;
	private int departmentID;
	private int acceptedBy;
	
	public Reimbursement(int reimbursementID, int monkeeyID, double amount, String reason, int status, int departmentID,
			int acceptedBy) {
		super();
		this.reimbursementID = reimbursementID;
		this.monkeeyID = monkeeyID;
		Amount = amount;
		this.reason = reason;
		this.status = status;
		this.departmentID = departmentID;
		this.acceptedBy = acceptedBy;
	}

	public Reimbursement(int int1, int int2, String string, int int3, int int4, int int5) {
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(int int1, double double1, String string, int int2, int int3, int int4) {
		// TODO Auto-generated constructor stub
	}

	public int getReimbursementID() {
		return reimbursementID;
	}

	public void setReimbursementID(int reimbursementID) {
		this.reimbursementID = reimbursementID;
	}

	public int getMonkeeyID() {
		return monkeeyID;
	}

	public void setMonkeeyID(int monkeeyID) {
		this.monkeeyID = monkeeyID;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public int getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(int acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + acceptedBy;
		result = prime * result + departmentID;
		result = prime * result + monkeeyID;
		result = prime * result + ((reason == null) ? 0 : reason.hashCode());
		result = prime * result + reimbursementID;
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(Amount) != Double.doubleToLongBits(other.Amount))
			return false;
		if (acceptedBy != other.acceptedBy)
			return false;
		if (departmentID != other.departmentID)
			return false;
		if (monkeeyID != other.monkeeyID)
			return false;
		if (reason == null) {
			if (other.reason != null)
				return false;
		} else if (!reason.equals(other.reason))
			return false;
		if (reimbursementID != other.reimbursementID)
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementID=" + reimbursementID + ", monkeeyID=" + monkeeyID + ", Amount=" + Amount
				+ ", reason=" + reason + ", status=" + status + ", departmentID=" + departmentID + ", acceptedBy="
				+ acceptedBy + "]";
	}
	
	
}
