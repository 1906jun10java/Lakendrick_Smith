package com.revature.beans;

public class User {
	

	private String monkeeyId;
	private String departmentID;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String reportsTo;
	private String managerOf;
	
	
	public User(String monkeeyId, String departmentID, String firstName, String lastName, String email, String username,
			String reportsTo, String managerOf) {
		super();
		this.monkeeyId = monkeeyId;
		this.departmentID = departmentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.reportsTo = reportsTo;
		this.managerOf = managerOf;
		
		
	}


	public String getMonkeeyId() {
		return monkeeyId;
	}


	public void setMonkeeyId(String monkeeyId) {
		this.monkeeyId = monkeeyId;
	}


	public String getDepartmentID() {
		return departmentID;
	}


	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
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


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getReportsTo() {
		return reportsTo;
	}


	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}


	public String getManagerOf() {
		return managerOf;
	}


	public void setManagerOf(String managerOf) {
		this.managerOf = managerOf;
	}


	@Override
	public String toString() {
		return "User [monkeeyId=" + monkeeyId + ", departmentID=" + departmentID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", username=" + username + ", reportsTo=" + reportsTo
				+ ", managerOf=" + managerOf + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentID == null) ? 0 : departmentID.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((managerOf == null) ? 0 : managerOf.hashCode());
		result = prime * result + ((monkeeyId == null) ? 0 : monkeeyId.hashCode());
		result = prime * result + ((reportsTo == null) ? 0 : reportsTo.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (departmentID == null) {
			if (other.departmentID != null)
				return false;
		} else if (!departmentID.equals(other.departmentID))
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
		if (managerOf == null) {
			if (other.managerOf != null)
				return false;
		} else if (!managerOf.equals(other.managerOf))
			return false;
		if (monkeeyId == null) {
			if (other.monkeeyId != null)
				return false;
		} else if (!monkeeyId.equals(other.monkeeyId))
			return false;
		if (reportsTo == null) {
			if (other.reportsTo != null)
				return false;
		} else if (!reportsTo.equals(other.reportsTo))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	

}
