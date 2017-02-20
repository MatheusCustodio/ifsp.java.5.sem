package com.sem5.persistency;

import javax.persistence.EntityManager;

public abstract class Persistency {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
