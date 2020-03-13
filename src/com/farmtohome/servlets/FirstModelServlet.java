/**
 * File Name: FirstModelServlet.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.farmtohome.jpa.data.Customer;
import com.farmtohome.jpa.data.CustomerService;


/**
 * Servlet implementation class FirstModelServlet
 */
@WebServlet("/FirstModelServlet")
public class FirstModelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		String user= request.getParameter("username");
		String pass = request.getParameter("password");
		request.setAttribute("username", user);
		request.setAttribute("loggedIn", false);
		request.setAttribute("name", null);
		
		CustomerService cs = new CustomerService();			
		List<Customer> customer = cs.getAll();
		request.setAttribute("custList", customer);		
		
		for( Customer creds : customer) {
			if( creds.getEmail().equals(user)
					&& creds.getPassword().equals(pass)) {
				request.setAttribute("loggedIn", true);	
				String str1 = creds.getFirstName();
				String str2 = " ";
				String str3 = creds.getLastName();
				StringConcat s = (s1,s2,s3) -> s1 + s2 + s3;				 //Lambda expression to concatinate first name and lastname
				session.setAttribute("name", s.sconcat(str1, str2, str3)); 
				session.setAttribute("customer", creds);
				break;
			}
		}
		
		//cs.close();
		cs=null;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
	}
}
