package com.revature.spms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer> {

}
