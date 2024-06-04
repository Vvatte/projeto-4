package br.com.vvatte.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.vvatte.dao.generic.GenericDAO;
import br.com.vvatte.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
