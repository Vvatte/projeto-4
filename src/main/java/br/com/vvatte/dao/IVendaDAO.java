package br.com.vvatte.dao;

import br.com.vvatte.dao.generic.IGenericDAO;
import br.com.vvatte.domain.Venda;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;


	public Venda consultarComCollection(Long id);
}
