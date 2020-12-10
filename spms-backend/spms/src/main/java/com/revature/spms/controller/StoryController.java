package com.revature.spms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spms.entity.Story;
import com.revature.spms.service.StoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/story")
public class StoryController {

	@Autowired
	StoryService service;
	
	// get all
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<Story> getAllStories(){
		return this.service.getAllStories();
	}
	
	// get one
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	public Story getStoryById(@PathVariable long id) {
		return this.service.getStoryById(id);
	}	
	
	// create new
	@RequestMapping(value = "/add", method = RequestMethod.POST)	
	
	public Story createNewStory(@RequestBody Story story) {
		
		return this.service.addStory(story);
	}
	
	// update
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)	
	@ResponseBody
	public Story editStory(@RequestBody Story story, @PathVariable long id) {
		
		return this.service.updateStory(story, id);
	}
	// delete
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)	
	@ResponseBody
	public void deleteStory(@PathVariable long id) {
		
		 this.service.deleteStory(id);
	}
}
