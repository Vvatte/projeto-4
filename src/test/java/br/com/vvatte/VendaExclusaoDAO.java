package br.com.vvatte;

import br.com.vvatte.dao.IVendaDAO;
import br.com.vvatte.dao.generic.GenericDAO;
import br.com.vvatte.domain.Venda;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoDAO extends GenericDAO<Venda, Long> implements IVendaDAO {

    public VendaExclusaoDAO() {
        super(Venda.class);
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public Venda consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}