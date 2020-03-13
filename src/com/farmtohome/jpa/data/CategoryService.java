/**
 * File Name: CategoryService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;
import java.util.List;
import javax.persistence.*;

public class CategoryService extends AbstractService{
	
	    /**
	     * Add a new category
	     * @param category
	     */
		public void add(Category category) {
			em.getTransaction().begin();
			em.persist(category);
			em.getTransaction().commit();		
		}
		
		/**
		 * Get all category
		 * @return List<>
		 */		
		public List<Category> getAll() {
			Query query = em.createNamedQuery("FindAllCategory");
			List<Category> cList = query.getResultList();
			for (Category f : cList) {
				System.out.println(f);
			}		
			return cList;
		}
		
		/**
		 * Get Category by Id
		 * @param id
		 * @param name
		 * @return boolean
		 */
		public boolean update(int id, String name) {
			em.getTransaction().begin();
			Category ctg = em.find(Category.class, id);
			ctg.setCategoryName(name);
			em.getTransaction().commit();
			return true;
		}
		
		/**
		 * Delete category by Id
		 * @param id
		 */
		public void deleteById(int id) {
			Query query = em.createNamedQuery("DeleteById");
			em.getTransaction().begin();
			Category foundCategory = em.find(Category.class, id);
			em.remove(foundCategory);
			em.getTransaction().commit();		
		}
}
