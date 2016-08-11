package br.up.pos.spring.service;

import java.util.Collection;

import br.up.pos.spring.service.impl.BusinessException;


public interface GenericService<T> {
	
	public T find(Long codigo) throws BusinessException;
	
	public Collection<T> findAll();

	void save(T clazz) throws BusinessException;

	void update(T clazz) throws BusinessException;
	
	void delete(T clazz) throws BusinessException;
	
}
