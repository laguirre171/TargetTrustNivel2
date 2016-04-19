package br.com.tt.dao;

import java.util.List;

public interface Crud<T> {

	void salvar(T entity);

	T buscar(int id);

	T buscar(T t);

	List<T> consultar();

	List<T> consultar(T t);

	@Deprecated // V 2.0.0
	
	void excluir(T t);

	void excluir(int id);

}
