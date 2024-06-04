package br.com.vvatte.services;

import br.com.vvatte.dao.generic.IGenericDAO;
import br.com.vvatte.domain.Produto;
import br.com.vvatte.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IGenericDAO<Produto, String> produtoDAO) {
		super(produtoDAO);
	}

}
