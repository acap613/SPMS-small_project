package com.revature.spms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.Author;
import com.revature.spms.repos.AuthorRepo;

@Service
public class AuthorService {

	@Autowired
	AuthorRepo authorRepo;	

	public List<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		return this.authorRepo.findAll();
	}
	
	public Author getAuthorById(long id) {
		return this.authorRepo.findById(id).get();
	}

	public Author addAuthor(Author author) {
		// TODO Auto-generated method stub
		 return this.authorRepo.save(author);
		
	}

	public Author updateAuthor(Author author, Long id) {
		if(authorRepo.findById(id).isPresent()) {
			Author existingAuthor = authorRepo.findById(id).get();
			existingAuthor.setFirst_name(author.getFirst_name());
			existingAuthor.setLast_name(author.getLast_name());
			existingAuthor.setPoints_allowed(author.getPoints_allowed());
			
			Author updatedAuthor = authorRepo.save(existingAuthor);
			
			return  updatedAuthor;
		} else {
			return this.authorRepo.save(author);
		}		
	}

	public void deleteAuthor(Long id) {		
		this.authorRepo.deleteById(id);
	}
	
	
	
	
}
