package br.com.vvatte.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.vvatte.dao.Persistente;
import br.com.vvatte.exceptions.DAOException;
import br.com.vvatte.exceptions.MaisDeUmRegistroException;
import br.com.vvatte.exceptions.TableException;
import br.com.vvatte.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;

}