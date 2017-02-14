package com.sem5.DAO;

import javax.persistence.EntityManager;

import com.sem5.entity.Pessoa;

public class PessoaDAO extends DAO<Pessoa, Long> {

	public PessoaDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

}
