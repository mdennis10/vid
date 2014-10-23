package com.videovixx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.videovixx.model.Video;
import com.videovixx.service.VideoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired VideoService videoService;
	
	@RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
	public ModelAndView home ()
	{	
		videoService.saveVideo(new Video());
		ModelAndView view = new ModelAndView("index");
		return view;
	}
	
	@RequestMapping(value = "play", method = RequestMethod.GET)
	public String play ()
	{
		return "play";
	}
}//end HomeController class
