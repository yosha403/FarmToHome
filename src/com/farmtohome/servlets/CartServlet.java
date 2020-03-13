/**
 * File Name: CartServlet.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.farmtohome.jpa.data.Item;


/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Grab a session
		HttpSession session = request.getSession(true);
		
		double total=0.0;
		
		final String q1 = "quantity1";
		String name1 = request.getParameter(q1);
		String name2 = request.getParameter("quantity2");
		String name3 = request.getParameter("quantity3");
		
		String chicken1 = request.getParameter("chicken1");
		String chicken2 = request.getParameter("chicken2");
		String chicken3 = request.getParameter("chicken3");
		
		String meat1 = request.getParameter("meat1");
		String meat2 = request.getParameter("meat2");
		String meat3 = request.getParameter("meat3");
			
		List<Item> theItems = new ArrayList<>();
		int quant1 = Integer.valueOf(name1);
		int quant2 = Integer.valueOf(name2);
		int quant3 = Integer.valueOf(name3);
		
		int quant4 = Integer.valueOf(chicken1);
		int quant5 = Integer.valueOf(chicken2);
		int quant6 = Integer.valueOf(chicken3);
		
		int quant7 = Integer.valueOf(meat1);
		int quant8 = Integer.valueOf(meat2);
		int quant9 = Integer.valueOf(meat3);

		if(quant1 != 0) {
			Item item1 = new Item("Tilapia fillet", 6.99, quant1);
			theItems.add(item1);	
			total = total + (6.99*quant1);
		}
		if(quant2 != 0) {
			Item item2 = new Item("Salmon", 5.99, quant2);
			theItems.add(item2);
			total = total + (5.99*quant2);
		}
		if(quant3 != 0) {
			Item item3 = new Item("Tuna", 8.99, quant3);
			theItems.add(item3);
			total = total + (8.99*quant3);
		}	
		
		if(quant4 != 0) {
			Item item1 = new Item("Chicken drumstick", 7.99, quant4);
			theItems.add(item1);
			total = total + (7.99*quant4);
		}
		if(quant5 != 0) {
			Item item2 = new Item("Whole chicken", 5.99, quant5);
			theItems.add(item2);
			total = total + (5.99*quant5);
		}
		if(quant6 != 0) {
			Item item3 = new Item("Boneless chicken", 8.99, quant6);
			theItems.add(item3);
			total = total + (8.99*quant6);
		}
		
		if(quant7 != 0) {
			Item item1 = new Item("Pork belly", 6.99, quant7);
			theItems.add(item1);	
			total = total + (6.99*quant7);
		}
		if(quant8 != 0) {
			Item item2 = new Item("Beef steak", 8.99, quant8);
			theItems.add(item2);
			total = total + (8.99*quant8);
		}
		if(quant9 != 0) {
			Item item3 = new Item("Beef rib", 9.99, quant9);
			theItems.add(item3);
			total = total + (9.99*quant9);
		}
				
				session.setAttribute("total", total);
				
				
				session.setAttribute("cart",theItems);		
				
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
