package br.com.vvatte.services;

import br.com.vvatte.dao.IClienteDAO;
import br.com.vvatte.domain.Cliente;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.exceptions.MaisDeUmRegistroException;
import br.com.vvatte.exceptions.TableException;
import br.com.vvatte.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {



	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}



	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}