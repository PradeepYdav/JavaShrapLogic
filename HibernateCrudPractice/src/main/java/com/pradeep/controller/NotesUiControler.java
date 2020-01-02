package com.pradeep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pradeep.model.Notes;
import com.pradeep.repository.NotesRepository;

@Controller
public class NotesUiControler {
	
	@Autowired
	NotesRepository notesRepository;
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		ModelAndView md= new ModelAndView("index.jsp");
		md.addObject("notes", notesRepository.findAll());
		return md;
	}
	
	@GetMapping("addnotes")
	public String getaddNotespage() {
		return "addnotes.jsp";
	}
	
	@PostMapping("addnotes")
	public ModelAndView addnotesPage(Notes notes) {
		notesRepository.save(notes);
		ModelAndView md= new ModelAndView("addnotes.jsp");
		md.addObject("resp", "Notes Added Succesfully");
		return md;
	}
	
	@GetMapping("deleteNotes")
	public String  deleteNotes(@RequestParam("id") Long id) {
		Notes not=notesRepository.findById(id).orElse(new Notes());
		if(not!=null) {
			notesRepository.delete(not);
		}
		return "redirect:/";
	}
	
	@GetMapping("updateNotes")
	public ModelAndView getupdateNotes(@RequestParam("id") Long id) {
		Notes not=notesRepository.findById(id).orElse(new Notes());
		ModelAndView md= new ModelAndView("update.jsp");
		if(not!=null) {
			md.addObject("note", not);
		}
		return md;
		
	}
	
	@PostMapping("updateNotes")
	public String  updateNotes(Notes notes) {
		notesRepository.save(notes);
		return "redirect:/";
	}
	

}
