package com.revature.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.daoImpl.MonkeeyDAOImpl;
import com.revature.daos.MonkeeyDAO;
import com.revature.service.Parse;

@WebServlet("/HomePage")
public class MangerHomepage extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Parse pm = new Parse();
		if (session != null) {
			String gorilla = session.getAttribute("managerOf").toString();
			int managerOf = pm.tryParseInt(gorilla);
			if (managerOf > 0) {
				response.sendRedirect("profile.html");
			} else {
				request.getRequestDispatcher("profile.html").forward(request, response);
			}
		} else {
			response.sendRedirect("login");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
