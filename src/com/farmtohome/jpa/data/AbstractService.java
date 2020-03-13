/**
 * File Name: AbstractService.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractService {

	protected EntityManagerFactory emf;
	protected EntityManager em;
		
	public AbstractService() {
		emf = Persistence.createEntityManagerFactory("FarmToHomeProject");
		em = emf.createEntityManager();
	}
	protected void cleanup() {
		em.close();
		emf.close();
	}
}
