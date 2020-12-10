package com.revature.spms.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.Editor;
import com.revature.spms.entity.Genre;
import com.revature.spms.repos.EditorRepo;
import com.revature.spms.repos.GenreRepo;

@Service
public class EditorService {

	@Autowired
	EditorRepo editorRepo;	
	
	@Autowired
	GenreService genreService;

	public List<Editor> getAllEditors() {
		// TODO Auto-generated method stub
		return this.editorRepo.findAll();
	}

	public Editor addEditor(Editor editor) {
//		Editor newEditor = new Editor();
//		newEditor.setFirst_name(editor.getFirst_name());
//		newEditor.setLast_name(editor.getLast_name());
//		newEditor.setPoints_allowed(editor.getPoints_allowed());
//		newEditor.setIs_assistant(editor.getIs_assistant());
//		newEditor.setIs_general(editor.getIs_general());
//		newEditor.setIs_senior(editor.getIs_senior());
//		newEditor.getGenres()
//			.addAll(editor
//					.getGenres()
//					.stream()
//					.map(g -> {
//						Genre gg = genreService.getGenreById(g.getId());
//						gg.getEditors().add(newEditor);
//						return gg;
//					}).collect(Collectors.toSet()));
			
		return this.editorRepo.save(editor);
		
		
	}

	public Editor updateEditor(Editor editor, Long id) {
		if(editorRepo.findById(id).isPresent()) {
			
			Editor existingEditor = editorRepo.findById(id).get();
			
			existingEditor.setFirst_name(editor.getFirst_name());
			existingEditor.setLast_name(editor.getLast_name());
			existingEditor.setPoints_allowed(editor.getPoints_allowed());
			existingEditor.setIs_assistant(editor.getIs_assistant());
			existingEditor.setIs_general(editor.getIs_general());
			existingEditor.setIs_senior(editor.getIs_senior());
			
			Editor updatedEditor = editorRepo.save(existingEditor);
			
			return  updatedEditor;
		} else {
			return this.editorRepo.save(editor);
		}		
	}

	public void deleteEditor(Long id) {		
		this.editorRepo.deleteById(id);
	}

	public Editor getEditorById(long id) {
		return this.editorRepo.findById(id).get();
	}

	
	
}
