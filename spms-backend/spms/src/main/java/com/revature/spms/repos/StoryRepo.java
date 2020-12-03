package com.revature.spms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.Story;

@Repository
public interface StoryRepo extends JpaRepository<Story, Long>{

}
