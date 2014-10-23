package com.videovixx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.videovixx.data.VideoRepo;
import com.videovixx.model.Video;

@Service
public class VideoServiceImpl implements VideoService{
	@Autowired private VideoRepo repo;
	private Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);
	
	public Video saveVideo (Video video)
	{
		if (video == null)
			throw new NullPointerException("");
		
		video.setId("xyz");
		video.setName("Video Name");
		video.setSrc("Source");
		video.setThumbnail("Thumbnail");
		repo.save(video);
		
		video = repo.findById(video.getId());
		if(video != null)
			logger.info("Video saved");
		else
			logger.info("video not saved");
		
		return video;
	}
}
