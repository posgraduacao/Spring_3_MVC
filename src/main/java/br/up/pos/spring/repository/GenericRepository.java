package br.up.pos.spring.repository;

import java.io.Serializable;
import java.util.Collection;

public interface GenericRepository<T, ID extends Serializable> {

	public T find(ID id);

	public void save(T entity);

	public T update(T entity);

	public void remove(T entity);

	public Collection<T> findAll();

	public Collection<T> findInRange(int firstResult, int maxResults);

	public Long count();
	
	public void executeUpdateNativeQuery(StringBuffer nativeQuery);
}
