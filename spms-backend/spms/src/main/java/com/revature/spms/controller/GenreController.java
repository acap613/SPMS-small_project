package com.revature.spms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spms.entity.Genre;
import com.revature.spms.service.GenreService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/genre")
public class GenreController {

	@Autowired
	GenreService service;
	
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
