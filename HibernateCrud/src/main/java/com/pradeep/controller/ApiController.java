package com.pradeep.controller;

import java.util.List;

import javax.validation.Valid;

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
import com.pradeep.repository.NoteRepository;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	NoteRepository noteRepository;
	
	@GetMapping("/notes")
	public List<Notes> getAllNotes(){
		return noteRepository.findAll();
	}
	
	
	@PostMapping("/notes")
	public Notes saveNotes(@Valid @RequestBody Notes notes) {
		return noteRepository.save(notes);
		
	}
	
	@GetMapping("/notes/{id}")
	public Notes getNoteById(@PathVariable(value = "id") Long id) {
		return noteRepository.findById(id).orElse(new Notes());
	}
	
	@PutMapping("/notes/{id}")
	public Notes updateNote(@PathVariable(value = "id") Long id,@RequestBody Notes notes) {
		
		Notes note= noteRepository.findById(id).orElse(new Notes());
		note.setContnet(notes.getContnet());
		note.setTitle(notes.getTitle());
		
		Notes updatedNotes=noteRepository.save(note);
		
		return updatedNotes;
		
	}
	
	
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id) {
		
		Notes note=noteRepository.findById(id).orElse(new Notes());
		
		noteRepository.delete(note);
		
		
		return ResponseEntity.ok().build();
		
	}
	
	

}
