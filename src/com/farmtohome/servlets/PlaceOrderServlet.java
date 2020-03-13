/**
 * File Name: PlaceOrderServlet.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.farmtohome.jpa.data.Customer;
import com.farmtohome.jpa.data.Item;
import com.farmtohome.jpa.data.OrderDetails;
import com.farmtohome.jpa.data.OrderDetailsService;
import com.farmtohome.jpa.data.OrderHeader;
import com.farmtohome.jpa.data.OrderHeaderService;

/**
 * Servlet implementation class PlaceOrderServlet
 */
@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlaceOrderServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		//Object dList = session.getAttribute("cart");
		List<Item> cart = (List<Item>) session.getAttribute("cart");		
		String custname = request.getParameter("custname");
		String custemail = request.getParameter("custemail");
		String custaddress = request.getParameter("custaddress");
		String custcity = request.getParameter("custcity");
		String custstate = request.getParameter("custstate");
		String custzip = request.getParameter("custzip");

		// int zipcode = Integer.valueOf(custzip);

		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		Customer c = (Customer) session.getAttribute("customer");
		
		OrderHeaderService ohService = new OrderHeaderService();
		OrderDetails odetails;
		OrderDetailsService ods = new OrderDetailsService();	
						
		if (!cart.isEmpty()) {			
			for (Item item : cart) {				
				odetails = new OrderDetails(item.getItemQuantity(),item.getItemPrice()*item.getItemQuantity());				
				ods.add(odetails);
			}
			OrderHeader oh;		
			oh = new OrderHeader(custaddress, custcity, custstate, "United States", custzip, date,"Order received",ods.getAll(),c);			
			ohService.add(oh);
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/success.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
