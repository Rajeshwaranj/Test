package com.candidjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String un=request.getParameter("uname");
		Integer pw=Integer.parseInt(request.getParameter("pass"));
		
		HttpSession session= request.getSession();
		session.setAttribute("name", un);
		session.setAttribute("p", pw);
		
		response.sendRedirect("home.jsp");
	}

}
