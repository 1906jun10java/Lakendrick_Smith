package com.revature.beans;

public class Monkeey {
	
	private int monkeeyID;
	private int departmentId;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private int reportsTo;
	private int managerOf;
	
	public Monkeey(int monkeeyID, int departmentId, String firstName, String lastName, String email, String userName,
			String password, int reportsTo, int managerOf) {
		super();
		this.monkeeyID = monkeeyID;
		this.departmentId = departmentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.reportsTo = reportsTo;
		this.managerOf = managerOf;
	}

	

	



	public Monkeey(int int1, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated constructor stub
	}



	public Monkeey(int int1, String string, String string2, String string3, String string4, String string5, int int2,
			int int3) {
		// TODO Auto-generated constructor stub
	}







	public int getMonkeeyID() {
		return monkeeyID;
	}

	public void setMonkeeyID(int monkeeyID) {
		this.monkeeyID = monkeeyID;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	public int getManagerOf() {
		return managerOf;
	}

	public void setManagerOf(int managerOf) {
		this.managerOf = managerOf;
	}

	@Override
	public String toString() {
		return "Monkeey [monkeeyID=" + monkeeyID + ", departmentId=" + departmentId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", userName=" + userName + ", password=" + password
				+ ", reportsTo=" + reportsTo + ", managerOf=" + managerOf + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + managerOf;
		result = prime * result + monkeeyID;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + reportsTo;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		Monkeey other = (Monkeey) obj;
		if (departmentId != other.departmentId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (managerOf != other.managerOf)
			return false;
		if (monkeeyID != other.monkeeyID)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (reportsTo != other.reportsTo)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	

}
