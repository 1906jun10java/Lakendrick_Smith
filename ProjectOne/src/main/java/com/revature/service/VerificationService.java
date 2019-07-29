package com.revature.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Monkeey;
import com.revature.daoImpl.MonkeeyDAOImpl;

public class VerificationService {
	
MonkeeyDAOImpl monImpl = new MonkeeyDAOImpl();
	
	
	public boolean credentialVerification(String username, String password) {
		List<Monkeey> verification = new ArrayList<Monkeey>();

		try {
			verification.addAll(monImpl.getAllMonkeeys());
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	
	
		for(Monkeey m : verification) {
			if(m.getUserName() == null) {
				return false;
			}
			if(m.getUserName().equals(username)){ 
				if(m.getPassword().equals(password)) {
					return true;
				}
			}
		}
	
		return false;
	}


}


