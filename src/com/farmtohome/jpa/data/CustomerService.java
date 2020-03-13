/**
 * File Name: CustomerService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.List;

import javax.persistence.Query;

public class CustomerService extends AbstractService{

			/**
			 * Add a new customer
			 * @param customer
			 */
			public void add(Customer customer) {
				em.getTransaction().begin();
				em.persist(customer);
				em.getTransaction().commit();

			}
			
			/**
			 * Get all customers
			 * @return List<>
			 */
			public List<Customer> getAll() {
				Query query = em.createNamedQuery("FindAllCustomer");
				List<Customer> custList = query.getResultList();
				for (Customer c : custList) {
					//System.out.println(c);
				}		
				return custList;
			}
			
			/**
			 * Update Customer password by id
			 * @param id
			 * @param password
			 * @return boolean
			 */
			public boolean update(int id, String password) {
				em.getTransaction().begin();
				Customer ctg = em.find(Customer.class, id);
				ctg.setPassword(password);
				em.getTransaction().commit();
				return true;
			}
			/**
			 * Delete customer by id
			 * @param id
			 */
			public void deleteById(int id) {
				Query query = em.createNamedQuery("DeleteCustbyId");
				em.getTransaction().begin();
				Customer foundCustomer = em.find(Customer.class, id);
				em.remove(foundCustomer);
				em.getTransaction().commit();		
			}
}
