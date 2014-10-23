package com.videovixx.data;

import java.io.Serializable;


public interface GenericRepo <T> {

	/**
	 * Find entity by id
	 * @author Mario Dennis
	 * @param id
	 * @return T
	 */
	public T findById(Serializable id);

	
	/**
	 * Delete entity
	 * @author Mario Dennis
	 * @param entity
	 */
	public void delete (T entity);
	
	
	/**
	 * Save entity
	 * @author Mario Dennis
	 * @param entity
	 * @return Serializable ID of saved entity
	 */
	public Serializable save(T entity);
	

	/**
	 * Update entity
	 * @author Mario Dennis
	 * @param entity
	 */
	public void update (T entity);
}