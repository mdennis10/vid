package com.videovixx.data;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractHibernateRepo<T> implements GenericRepo<T>{

	@Autowired private SessionFactory sessionFactory;
	private final Class<T> clazz;
	
	/**
	 * Default Constructor
	 * @author mario
	 * @param clazz
	 */
	public AbstractHibernateRepo(Class<T> clazz) 
	{
		this.clazz = clazz;
	}

	/**
	 * Find entity by ID.
	 * @author Mario Dennis
	 * @param id
	 */
	@SuppressWarnings("unchecked")
	@Transactional(rollbackFor = HibernateException.class)
	@Override
	public T findById(Serializable id) 
	{
		if (id == null)
			throw new NullPointerException();
		
		return (T) getSessionFactory().getCurrentSession().get(getClazz(), id);
	}
	
	/**
	 * Save entity
	 * @author Mario Dennis
	 * @param entity
	 * @return Serializable ID of saved entity
	 */
	@Override
	@Transactional(rollbackFor = HibernateException.class)
	public Serializable save(T entity) 
	{
		if (entity == null)
			throw new NullPointerException();
		
		return getSessionFactory().getCurrentSession().save(entity);
	}
	
	
	/**
	 * Delete entity
	 * @author Mario Dennis
	 * @param entity
	 */
	@Override
	@Transactional(rollbackFor = HibernateException.class)
	public void delete(T entity) 
	{
		if (entity == null)
			throw new NullPointerException();
		
		getSessionFactory().getCurrentSession().delete(entity);
	}
	
	
	/**
	 * Update entity
	 * @author Mario Dennis
	 * @param entity
	 */
	@Override
	@Transactional(rollbackFor = HibernateException.class)
	public void update(T entity) 
	{
		if (entity == null)
			throw new NullPointerException();
		
		getSessionFactory().getCurrentSession().update(entity);
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @return the clazz
	 */
	public Class<T> getClazz() 
	{
		return clazz;
	}
		
}
