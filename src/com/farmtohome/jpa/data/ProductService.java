/**
 * File Name: ProductService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.List;

import javax.persistence.Query;

public class ProductService extends AbstractService{
				
				// add
				public void add(Product product) {
					em.getTransaction().begin();
					em.persist(product);
					em.getTransaction().commit();		
				}
				
				// find all
				public List<Product> getAll() {
					Query query = em.createNamedQuery("FindAllProducts");
					List<Product> prodList = query.getResultList();
					for (Product p : prodList) {
						System.out.println(p);
					}		
					return prodList;
				}
				
				// update
				public boolean update(int id, String name) {
					em.getTransaction().begin();
					Product p = em.find(Product.class, id);
					p.setName(name);
					em.getTransaction().commit();
					return true;
				}
				// delete by id
				public void deleteProdId(int id) {
					Query query = em.createNamedQuery("DeleteProdbyId");
					em.getTransaction().begin();
					Product foundProduct = em.find(Product.class, id);
					em.remove(foundProduct);
					em.getTransaction().commit();		
				}
}
