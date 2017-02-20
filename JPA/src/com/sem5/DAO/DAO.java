package com.sem5.DAO;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import com.sun.org.apache.bcel.internal.generic.Select;

public abstract class DAO<T, ID extends Serializable> {
	
	private EntityManager entityManager;
	
	private Class<T> persitency;
	
	@SuppressWarnings("unchecked")
	public DAO(EntityManager entityManager){
		this.persitency = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.entityManager = entityManager;
	}
	
	public void persist(T entity){
		entityManager.persist(entity);
	}
	
	public void update(T entity){
		entityManager.merge(entity);
	}
	
	public void remove(T entity){
		entityManager.remove(entity);
	}
	
	public T findById(ID id){
		return entityManager.find(persitency, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> entity){
		return entityManager.createQuery("SELECT o FROM "+entity.getSimpleName()+" o").getResultList();
	}
}
