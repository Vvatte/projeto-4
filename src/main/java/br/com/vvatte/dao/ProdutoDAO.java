package br.com.vvatte.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.vvatte.dao.generic.GenericDAO;
import br.com.vvatte.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
