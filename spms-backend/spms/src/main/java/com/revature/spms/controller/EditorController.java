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

import com.revature.spms.entity.Editor;
import com.revature.spms.service.EditorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/editor")
public class EditorController {

	@Autowired
	EditorService service;
	
	// ================ CREATE =============================
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Editor addEditor(@RequestBody Editor editor) {
		return this.service.addEditor(editor);
	} 
	// ====================================================
	
	//================== READ =============================
	@GetMapping("/get/all")
	public List<Editor> getAllEditors(){
		return this.service.getAllEditors();
	}	
	@GetMapping("/get/{id}")
	public Editor getEDitorById(@PathVariable long id) {
		return this.service.getEditorById(id);
	}
	// ====================================================
	
	// ================= UPDATE ===========================
	@RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
	@ResponseBody
	public Editor updateEditor(@RequestBody Editor editor, @PathVariable long id) {
		return this.service.updateEditor(editor, id);
	}
	
	// ====================== DELETE ======================
	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	public void deleteEditor(@PathVariable long id) {
		this.service.deleteEditor(id);
	}
	// ====================================================
}
