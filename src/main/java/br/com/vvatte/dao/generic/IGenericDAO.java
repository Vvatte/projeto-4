package br.com.vvatte.dao.generic;

import br.com.vvatte.dao.Persistente;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.exceptions.MaisDeUmRegistroException;
import br.com.vvatte.exceptions.TableException;
import br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;
}
