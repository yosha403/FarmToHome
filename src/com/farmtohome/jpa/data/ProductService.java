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
				
				/**
				 * Add new product
				 * @param product
				 */
				public void add(Product product) {
					em.getTransaction().begin();
					em.persist(product);
					em.getTransaction().commit();		
				}
				
				/**
				 * Get all products
				 * @return List<>
				 */
				public List<Product> getAll() {
					Query query = em.createNamedQuery("FindAllProducts");
					List<Product> prodList = query.getResultList();
					for (Product p : prodList) {
						System.out.println(p);
					}		
					return prodList;
				}
				
				/**
				 * Update product name by Id
				 * @param id
				 * @param name
				 * @return boolean
				 */
				public boolean update(int id, String name) {
					em.getTransaction().begin();
					Product p = em.find(Product.class, id);
					p.setName(name);
					em.getTransaction().commit();
					return true;
				}
				
				/**
				 * Delete product by Id
				 * @param id
				 */
				public void deleteProdId(int id) {
					Query query = em.createNamedQuery("DeleteProdbyId");
					em.getTransaction().begin();
					Product foundProduct = em.find(Product.class, id);
					em.remove(foundProduct);
					em.getTransaction().commit();		
				}
}
