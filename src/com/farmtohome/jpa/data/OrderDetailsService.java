/**
 * File Name: OrderDetailsService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.List;

import javax.persistence.Query;

public class OrderDetailsService extends AbstractService{

		// add
		public void add(OrderDetails details) {
			em.getTransaction().begin();
			em.persist(details);
			em.getTransaction().commit();		
		}
		
		// find all
		public List<OrderDetails> getAll() {
			Query query = em.createNamedQuery("FindAllDetails");
			List<OrderDetails> detailList = query.getResultList();
			for (OrderDetails p : detailList) {
				//System.out.println(p);
			}		
			return detailList;
		}				
		// update
		public boolean update(int id, int quantity) {
			em.getTransaction().begin();
			OrderDetails p = em.find(OrderDetails.class, id);
			p.setQuantity(quantity);
			em.getTransaction().commit();
			return true;
		}
		// delete by id
		public void deleteDetailId(int id) {
			Query query = em.createNamedQuery("DeleteDetailbyId");
			em.getTransaction().begin();
			OrderDetails foundDetail = em.find(OrderDetails.class, id);
			em.remove(foundDetail);
			em.getTransaction().commit();		
		}
}
