package com.revature.spms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spms.entity.Author;
import com.revature.spms.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	AuthorService service;
	
	@GetMapping("/get/all")
	public List<Author> getAllAuthors(){
		return this.service.getAllAuthors();
	}
	@GetMapping("/get/{id}")
	public Author getAuthorById(@PathVariable long id){
		return this.service.getAuthorById(id);
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)	
	@ResponseBody
	public Author addAuthor(@RequestBody Author author) {
		
		return this.service.addAuthor(author);
	}
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)	
	@ResponseBody
	public Author updateAuthor(@RequestBody Author author, @PathVariable Long id) {
		
		return this.service.updateAuthor(author, id);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)	
	@ResponseBody
	public void deleteAuthor(@PathVariable Long id) {
		
		this.service.deleteAuthor(id);
	}
	
	
	
}
