package com.revature.spms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.Author;
@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

}
