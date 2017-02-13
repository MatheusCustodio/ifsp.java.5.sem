package com.sem5.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.sem5.entity.Pessoa;
import com.sem5.services.PessoaServiceLocal;
import com.sem5.services.PessoaServiceRemote;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class PessoaService implements PessoaServiceLocal, PessoaServiceRemote {

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void savePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void updatePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void deletePessoa(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> listaPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

}
