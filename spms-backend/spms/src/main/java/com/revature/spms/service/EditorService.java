package com.revature.spms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spms.entity.Editor;
import com.revature.spms.repos.EditorRepo;

@Service
public class EditorService {

	@Autowired
	EditorRepo editorRepo;	

	public List<Editor> getAllEditors() {
		// TODO Auto-generated method stub
		return this.editorRepo.findAll();
	}

	public Editor addEditor(Editor editor) {
		// TODO Auto-generated method stub
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
