package com.ota.exam.notes_api;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;

import java.util.List; 

@RestController()
public class NoteController { 
    
    @Autowired
    private NoteService noteService; 
  
    @PostMapping("/add") 
    public void addStaticNotes() { 
        noteService.addNote(); 
    } 

    @PostMapping("/notes") 
    public void addNotes(@RequestBody Note note) { 
        noteService.addNote(note); 
    } 
  
    @GetMapping("/notes") 
    public List<Note> getAllNotes() { 
        return noteService.getNotes(); 
    } 

    @GetMapping("/notes/{id}") 
    public Note getNoteById(@PathVariable Long id) { 
        return noteService.getNote(id); 
    }
    
    @PutMapping("/notes/{id}") 
    public void updateNoteById(@PathVariable Long id, @RequestBody Note note)  { 
        noteService.updateNote(id, note); 
    }
  
    @DeleteMapping("/notes/{id}")
    public void removeNoteById(@PathVariable Long id) {
        noteService.deleteNote(id);
    }

    @GetMapping("/hello") 
    public String hello(){ 
        return "Hello World!"; 
    } 
}
