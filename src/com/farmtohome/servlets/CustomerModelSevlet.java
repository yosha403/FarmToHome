/**
 * File Name: CustomerModelSevlet.java
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

import com.farmtohome.jpa.data.Customer;
import com.farmtohome.jpa.data.CustomerService;

/**
 * Servlet implementation class CustomerModelSevlet
 */
@WebServlet("/CustomerModelSevlet")
public class CustomerModelSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerModelSevlet() {
        super();      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String mail= request.getParameter("email");
		String fname = request.getParameter("fistname");
		String lname = request.getParameter("lastname");
		String pass = request.getParameter("password");
		String phone = request.getParameter("phone");
		request.setAttribute("Exists", false);
		
		Customer customer = new Customer(fname,lname,mail,phone,pass,null);
		CustomerService cs = new CustomerService();	
		
		List<Customer> customer1 = cs.getAll();
		request.setAttribute("custList", customer1);		
		
		for( Customer creds : customer1) {
			if( creds.getEmail().equals(mail)) {
				request.setAttribute("Exists", true);				
				break;
			}
		}
		
		if (!(boolean) request.getAttribute("Exists")) {
			
			cs.add(customer);
			request.setAttribute("welcome","Account created successfully.Please sign in !!");
		}
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
