package br.com.vvatte.services;

import br.com.vvatte.domain.Cliente;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {


	Cliente buscarPorCPF(Long cpf) throws DAOException;


}
