/**
 * File Name: CheckoutServlet.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServlet() {
        super();      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String cardname = request.getParameter("cardname");
		String cardnumber = request.getParameter("cardnumber");
		String expmonth = request.getParameter("expmonth");
		String expyear = request.getParameter("expyear");
		String cvv = request.getParameter("cvv");
		
		request.setAttribute("fname", fullname);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("city", city);
		request.setAttribute("state", state);
		request.setAttribute("zip", zip);
		
		request.setAttribute("cname", cardname);
		request.setAttribute("cnumber", cardnumber);
		request.setAttribute("cmonth", expmonth);
		request.setAttribute("cyear", expyear);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/confirm.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
