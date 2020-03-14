/**
 * File Name: OrderDetailsService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.List;

import javax.persistence.Query;

import com.farmtohome.exceptions.QuantityException;

public class OrderDetailsService extends AbstractService{

		/**
		 * Add into order details
		 * @param details
		 */
		public void add(OrderDetails details) {
			em.getTransaction().begin();
			em.persist(details);
			em.getTransaction().commit();		
		}
		
		/**
		 * Get all order details
		 * @return List<>
		 */
		public List<OrderDetails> getAll() {
			Query query = em.createNamedQuery("FindAllDetails");
			List<OrderDetails> detailList = query.getResultList();
			for (OrderDetails p : detailList) {
				//System.out.println(p);
			}		
			return detailList;
		}
		
		/**
		 * Update quantity in order details
		 * @param id
		 * @param quantity
		 * @return boolean
		 */
		public boolean update(int id, int quantity) {
			em.getTransaction().begin();
			OrderDetails p = em.find(OrderDetails.class, id);
			try {
				p.setQuantity(quantity);
			} catch (QuantityException e) {			
				e.printStackTrace();
			}
			em.getTransaction().commit();
			return true;
		}
		/**
		 * Delete order details by Id
		 * @param id
		 */
		public void deleteDetailId(int id) {
			Query query = em.createNamedQuery("DeleteDetailbyId");
			em.getTransaction().begin();
			OrderDetails foundDetail = em.find(OrderDetails.class, id);
			em.remove(foundDetail);
			em.getTransaction().commit();		
		}
}
