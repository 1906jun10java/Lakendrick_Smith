package com.revature.service;

public class Parse {
	
	public double ParseAttempt(String userInput) {

		try {
			double num = Double.parseDouble(userInput);
			return num;
		}
		catch(Exception e){
			return 0;	
		}
	}
	
	public int tryParseInt(String userInput) {
		try {
			int num = Integer.parseInt(userInput);
			return num;
		}catch(Exception e){
			return 0;
		}
	}

}
