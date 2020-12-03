package com.revature.spms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.StoryPitch;

@Repository
public interface StoryPitchRepo extends JpaRepository<StoryPitch, Long> {

}
