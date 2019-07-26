package com.revature.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {

	//  connection factory
	private static ConnFactory cf = new ConnFactory();

	
	private ConnFactory() {
		super();
	}

	// generates instance of the ConnFactory 
	// 
	public static synchronized ConnFactory getInstance() {
		if (cf == null) { // if no instance exists
			cf = new ConnFactory(); // create a new instance of the ConnFactory
		}
		return cf;
	}

	// get connection to our database
	public Connection getConnection() {

			Connection conn = null;					//sets the connection to null
			Properties prop = new Properties();		

			try {
					InputStream stream =this.getClass().getResourceAsStream("/database.properties"); 
					prop.load(stream);
				Class.forName(prop.getProperty("driver"));				
				conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("usr"),prop.getProperty("password"));		//sets the values for url, username and password for the sql server
				
			} catch (FileNotFoundException e) {	
				e.printStackTrace();
			} catch (IOException e) {			
				e.printStackTrace();
			} catch (SQLException e) {			
				e.printStackTrace();	
			} catch (ClassNotFoundException e) {	
				e.printStackTrace();
			}catch (Exception e) {
				System.out.println();
				e.printStackTrace();
			}

			return conn;

		}

}