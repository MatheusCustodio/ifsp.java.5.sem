package com.sem5.DAO;

import java.io.Serializable;

import javax.persistence.EntityManager;

public abstract class DAO<T, ID extends Serializable> {
	
	private EntityManager entityManager;
	
	public DAO(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	public void persist(T entity){
		entityManager.persist(entity);
	}
	
	public void update(T entity){
		entityManager.merge(entity);
	}
	
}
