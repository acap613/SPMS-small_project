package com.revature.spms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.Story;
import com.revature.spms.repos.StoryRepo;

@Service
public class StoryService {

	@Autowired
	StoryRepo storyRepo;
	
	public List<Story> getAllStories() {
		// TODO Auto-generated method stub
		return this.storyRepo.findAll();
	}
	
	public Story getStoryById(long id) {
		return this.storyRepo.findById(id).get();
	}

	public Story addStory(Story story) {
		// TODO Auto-generated method stub
		 return this.storyRepo.save(story);
		
	}

	public Story updateStory(Story story, Long id) {
		if(storyRepo.findById(id).isPresent()) {
			Story existingStory = storyRepo.findById(id).get();
			existingStory.setText(story.getText());
			
			
			Story updatedStory = storyRepo.save(existingStory);
			
			return  updatedStory;
		} else {
			return this.storyRepo.save(story);
		}		
	}

	public void deleteStory(Long id) {		
		this.storyRepo.deleteById(id);
	}
	
}
