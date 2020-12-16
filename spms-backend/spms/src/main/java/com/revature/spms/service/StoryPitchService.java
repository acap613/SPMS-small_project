package com.revature.spms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.StoryPitch;
import com.revature.spms.repos.StoryPitchRepo;

@Service
public class StoryPitchService {

	@Autowired
	StoryPitchRepo spRepo;
	
	// get all
	public List<StoryPitch> getAllStoryPitches(){
		return this.spRepo.findAll();
	}
	
	// get one
	public StoryPitch getStoryPitchById(Long id) {
		return this.spRepo.findById(id).get();
	}
	
	// add new
	public StoryPitch addStoryPitch(StoryPitch storyPitch) {
		return this.spRepo.save(storyPitch);
	}
	
	// update (important for editors and authors alike)	
	public StoryPitch editStoryPitch(StoryPitch storyPitch, String username, Long id) {
		if(spRepo.findById(id).isPresent()) {
			StoryPitch sp = spRepo.findById(id).get();
			sp.setAuthor_id(storyPitch.getAuthor_id());
			sp.setTitle(storyPitch.getTitle());
			sp.setWord_count(storyPitch.getWord_count());
			sp.setCompletion_date(storyPitch.getCompletion_date());
			sp.setTag(storyPitch.getTag());
			sp.setGenre(storyPitch.getGenre());
			sp.setDescription(storyPitch.getDescription());
			sp.setApproved(storyPitch.getApproved());
			sp.setOn_hold(storyPitch.getOn_hold());
			
			StoryPitch updatedStoryPitch = spRepo.save(sp);
			
			return  updatedStoryPitch;
		} else {
			return this.spRepo.save(storyPitch);
		}		
	}
	
	public StoryPitch editStoryPitch(StoryPitch storyPitch, Long id) {
		if(spRepo.findById(id).isPresent()) {
			StoryPitch sp = spRepo.findById(id).get();
			sp.setAuthor_id(storyPitch.getAuthor_id());
			sp.setTitle(storyPitch.getTitle());
			sp.setWord_count(storyPitch.getWord_count());
			sp.setCompletion_date(storyPitch.getCompletion_date());
			sp.setTag(storyPitch.getTag());
			sp.setGenre(storyPitch.getGenre());
			sp.setDescription(storyPitch.getDescription());
			sp.setApproved(storyPitch.getApproved());
			sp.setOn_hold(storyPitch.getOn_hold());
			
			StoryPitch updatedStoryPitch = spRepo.save(sp);
			
			return  updatedStoryPitch;
		} else {
			return this.spRepo.save(storyPitch);
		}		
	}
	
	// delete
	public void deleteStoryPitch(Long id) {
		this.spRepo.deleteById(id);
	}
}
