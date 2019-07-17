package com.revature.beans;

public class Resolved_Request {

		private int userID;
		private int reiID;
		
		public Resolved_Request(int userID, int reiID) {
			super();
			this.userID = userID;
			this.reiID = reiID;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public int getReiID() {
			return reiID;
		}

		public void setReiID(int reiID) {
			this.reiID = reiID;
		}

		@Override
		public String toString() {
			return "Resolved_Request [userID=" + userID + ", reiID=" + reiID + "]";
		}
		
		
}
