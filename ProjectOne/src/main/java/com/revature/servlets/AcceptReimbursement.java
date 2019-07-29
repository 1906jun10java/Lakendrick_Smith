package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.Parse;
import com.revature.service.ReimbursementService;

//@WebServlet("/acceptReimbursement")
public class AcceptReimbursement extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	HttpSession session = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		session = request.getSession(false);
		if(session != null) {
			ReimbursementService rs = new ReimbursementService();
			Parse parse = new Parse();
			String rawREID = request.getParameter("id");
			String rawEmployeeID = session.getAttribute("eId").toString();
			int reid = parse.tryParseInt(rawREID);
			int empId = parse.tryParseInt(rawEmployeeID);
			rs.approveReimbursement(reid,empId);
			response.sendRedirect("employeeHomePage");
			
		}
		else {
			response.sendRedirect("login");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException  {
		doGet(request,response);
	}
}
