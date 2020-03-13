/**
 * File Name: OrderHeaderService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.List;

import javax.persistence.Query;

public class OrderHeaderService extends AbstractService{
	// add
	public void add(OrderHeader header) {
		em.getTransaction().begin();
		em.persist(header);
		em.getTransaction().commit();		
	}
	
	// find all
	public List<OrderHeader> getAll() {
		Query query = em.createNamedQuery("FindAllOrders");
		List<OrderHeader> orderList = query.getResultList();
		for (OrderHeader p : orderList) {
			System.out.println(p);
		}		
		return orderList;
	}
	
	public List<OrderHeader> getAllbyId(int id) {
		Query query = em.createNamedQuery("FindByCustId");
		query.setParameter("id", id);
		List<OrderHeader> dList = query.getResultList();			
		return dList;
	}

	
	// update
	public boolean update(int id, String status) {
		em.getTransaction().begin();
		OrderHeader p = em.find(OrderHeader.class, id);
		p.setOrderStatus(status);
		em.getTransaction().commit();
		return true;
	}
	// delete by id
	public void deleteOrder(int id) {
		Query query = em.createNamedQuery("DeleteOrderbyId");
		em.getTransaction().begin();
		OrderHeader foundOrder = em.find(OrderHeader.class, id);
		em.remove(foundOrder);
		em.getTransaction().commit();		
	}

}
