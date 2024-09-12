package com.ota.exam.notes_api;

import org.springframework.stereotype.Service; 
import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    private List<Note> noteList = new ArrayList<>(); 
  
    public void addNote() { 
        Note tweet = new Note(); 
        tweet.setId(1L); 
        tweet.setMsg("This is a dummy note for demonstration purposes."); 
        noteList.add(tweet); 
  
        tweet = new Note(); 
        tweet.setId(2L); 
        tweet.setMsg("This is the second dummy note for demonstration purposes."); 
        noteList.add(tweet); 
    }

    public void addNote(Note note) {
        noteList.add(note);
    }
  
    public Note getNote(Long id) {
        return noteList.stream().filter(note -> note.getId() == id).findAny().orElse(null);
    }

    public void updateNote(Long id, Note uNote) {
        Note note = noteList.stream().filter(n -> n.getId() == id).findAny().orElse(null);
        if (note != null) {
            note.setMsg(uNote.getMsg());
        }
    }
    
    public void deleteNote(Long id) {
        noteList.removeIf(n -> n.getId() == id);
    }

    public List<Note> getNotes() { 
        return noteList; 
    } 
}
