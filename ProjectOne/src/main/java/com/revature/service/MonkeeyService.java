package com.revature.service;

import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daoImpl.MonkeeyDAOImpl;
import com.revature.daos.MonkeeyDAO;

public class MonkeeyService {
	
	public String monkeeyListString() {
		MonkeeyDAO monkeeydao = new MonkeeyDAOImpl();
		ObjectMapper om = new ObjectMapper();
		String jsonString = "";
		try {
			jsonString = om.writeValueAsString(monkeeydao.getAllMonkeeys());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonString;
	
	}
}

