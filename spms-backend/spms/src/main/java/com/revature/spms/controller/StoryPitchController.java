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

import com.revature.spms.entity.StoryPitch;
import com.revature.spms.service.StoryPitchService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/story-pitch")
public class StoryPitchController {

	@Autowired
	StoryPitchService service;
	
	// get all
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public List<StoryPitch> getAllPitches(){
		return this.service.getAllStoryPitches();
	}
	
	// get one
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	public StoryPitch getPitchById(@PathVariable long id) {
		return this.service.getStoryPitchById(id);
	}	
	
	// create new
	@RequestMapping(value = "/add", method = RequestMethod.POST)	
	
	public StoryPitch createNewPitch(@RequestBody StoryPitch storyPitch) {
		
		return this.service.addStoryPitch(storyPitch);
	}
	
	// update Author update
	@RequestMapping(value = "author/{username}/edit/{id}", method = RequestMethod.PUT)	
	@ResponseBody
	public StoryPitch editStoryPitch(@RequestBody StoryPitch storyPitch,@PathVariable String username, @PathVariable long id) {
		
		return this.service.editStoryPitch(storyPitch, username, id);
	}
	
	// update Editor update
	// update
		@RequestMapping(value = "editor/edit/{id}", method = RequestMethod.PUT)	
		@ResponseBody
		public StoryPitch editStoryPitch(@RequestBody StoryPitch storyPitch, @PathVariable long id) {
			
			return this.service.editStoryPitch(storyPitch, id);
		}
	
	// delete
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)	
	@ResponseBody
	public void deleteStoryPitch(@PathVariable long id) {
		
		 this.service.deleteStoryPitch(id);
	}
}
