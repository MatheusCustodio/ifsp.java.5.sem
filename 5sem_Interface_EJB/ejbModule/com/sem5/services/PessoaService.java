package com.sem5.services;

import java.util.List;

import com.sem5.entity.Pessoa;

public interface PessoaService {
	
	public void savePessoa(Pessoa pessoa);
	
	public void updatePessoa(Pessoa pessoa);
	
	public void deletePessoa(long id);
	
	public List<Pessoa> listaPessoas();

}
