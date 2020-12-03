package com.revature.spms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.Genre;

@Repository
public interface GenreRepo extends JpaRepository<Genre, Long> {

}
