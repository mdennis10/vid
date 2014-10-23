package com.videovixx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.videovixx.model.Video;

@RestController
public class WebServiceController {

	@RequestMapping(value = "/video")
	public Video videoService ()
	{
		Video video = new Video();
		video.setId("xyz");
		video.setName("Video Name");
		video.setSrc("Source");
		video.setThumbnail("Thumbnail");
		
		return video;
	}
}
