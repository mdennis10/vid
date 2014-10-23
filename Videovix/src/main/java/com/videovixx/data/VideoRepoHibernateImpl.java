package com.videovixx.data;

import org.springframework.stereotype.Repository;

import com.videovixx.model.Video;

@Repository
public class VideoRepoHibernateImpl extends AbstractHibernateRepo<Video> implements VideoRepo{

	/**
	 * Default Constructor
	 * @author mario
	 */
	public VideoRepoHibernateImpl() 
	{
		super(Video.class);
	}
}
