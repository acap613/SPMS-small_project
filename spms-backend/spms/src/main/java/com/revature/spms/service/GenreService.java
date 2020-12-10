package com.revature.spms.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.Editor;
import com.revature.spms.entity.Genre;
import com.revature.spms.repos.EditorRepo;
import com.revature.spms.repos.GenreRepo;

@Service
public class GenreService {

	@Autowired
	GenreRepo genreRepo;
	@Autowired
	EditorRepo editorRepo;
	
	public List<Genre> getAllGenres() {
		// TODO Auto-generated method stub
		return this.genreRepo.findAll();
	}
	
	public Genre getGenreById(long id) {
		return this.genreRepo.findById(id).get();
	}

	public Genre addGenre(Genre genre) {
		// TODO Auto-generated method stub
		 return this.genreRepo.save(genre);
		
	}

	public Genre updateGenre(Genre genre, Long id) {
		if(genreRepo.findById(id).isPresent()) {
			Genre existingGenre = genreRepo.findById(id).get();
			existingGenre.setGenre(genre.getGenre());
			
			
			Genre updatedGenre = genreRepo.save(existingGenre);
			
			return  updatedGenre;
		} else {
			return this.genreRepo.save(genre);
		}		
	}

	public void deleteGenre(Long id) {		
		this.genreRepo.deleteById(id);
	}	
	
}
