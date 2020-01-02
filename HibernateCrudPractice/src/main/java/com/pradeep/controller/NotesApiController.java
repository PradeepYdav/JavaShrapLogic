package com.pradeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradeep.model.Notes;
import com.pradeep.repository.NotesRepository;

@RestController
@RequestMapping("/api")
public class NotesApiController {

	@Autowired
	NotesRepository notesRepository;
	
	@GetMapping("/notes")
	public List<Notes> getAllNotes(){
		return notesRepository.findAll();
		
	}
	
	@PostMapping("/notes")
	public Notes saveNotes(@RequestBody Notes notes) {
		return notesRepository.save(notes);
	}
	
	@GetMapping("/notes/{id}")
	public Notes getNotesById(@PathVariable(value = "id") Long id) {
		return notesRepository.findById(id).orElse(new Notes());
	}
	
	@PutMapping("notes/{id}")
	public Notes updateNotes(@PathVariable(value = "id")Long id,@RequestBody Notes notes) {
		Notes not=notesRepository.findById(id).orElse(new Notes());
		
		if(not!=null) {
			not.setTitle(notes.getTitle());
			not.setContnet(notes.getContnet());
		}
		Notes updatenote=notesRepository.save(not);
		return updatenote;
		
	}
	
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id){
		Notes not=notesRepository.findById(id).orElse(new Notes());
		
		if(not!=null) {
			notesRepository.delete(not);
		}
		
		return ResponseEntity.ok().build();
	}
	
}
