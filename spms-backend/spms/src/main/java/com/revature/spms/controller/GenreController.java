package com.revature.spms.controller;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spms.entity.Editor;
import com.revature.spms.entity.Genre;
import com.revature.spms.repos.EditorRepo;
import com.revature.spms.service.GenreService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/genre")
public class GenreController {

	@Autowired
	GenreService service;
	
	@Autowired
	EditorRepo editorRepo;
	
	// ================ CREATE =============================
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Genre addGenre(@RequestBody Genre genre) {
		return this.service.addGenre(genre);
	} 
	// ====================================================
	
	//================== READ =============================
	@GetMapping("/get/all")
	public List<Genre> getAllGenres(){
		return this.service.getAllGenres();
	}	
	@GetMapping("/get/{id}")
	public Genre getGenreById(@PathVariable long id) {
		return this.service.getGenreById(id);
	}
	
	@GetMapping("/get/{id}/editors")
	public Set<Editor> getGenreEditorsById(@PathVariable long id) {
		return new HashSet<Editor>();
		
		
	}
	// ====================================================
	
	// ================= UPDATE ===========================
	@RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Genre updateGenre(@RequestBody Genre genre, @PathVariable long id) {
		return this.service.updateGenre(genre, id);
	}
	
	// ====================== DELETE ======================
	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteGenre(@PathVariable long id) {
		this.service.deleteGenre(id);
	}
	// ====================================================
}
