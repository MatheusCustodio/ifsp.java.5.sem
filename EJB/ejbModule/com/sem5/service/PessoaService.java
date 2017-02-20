package com.sem5.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.PostActivate;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.sem5.DAO.PessoaDAO;
import com.sem5.entity.Pessoa;
import com.sem5.persistency.Persistency;
import com.sem5.services.PessoaServiceLocal;
import com.sem5.services.PessoaServiceRemote;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PessoaService extends Persistency implements PessoaServiceLocal, PessoaServiceRemote {
	
	private PessoaDAO dao;
	
	
	public PessoaDAO getDao() {
		return dao;
	}

	public void setDao(PessoaDAO dao) {
		this.dao = dao;
	}

	@PostConstruct
	@PostActivate
	public void init(){
		dao = new PessoaDAO(this.getEntityManager());
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void savePessoa(Pessoa pessoa) {
		this.getDao().persist(pessoa);
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updatePessoa(Pessoa pessoa) {
		this.getDao().update(pessoa);
		
	}
	
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deletePessoa(long id) {
		this.getDao().remove(this.getDao().findById(id));
		
	}

	@Override
	public List<Pessoa> listaPessoas() {
		return this.getDao().findAll(Pessoa.class);
		
	}


}
