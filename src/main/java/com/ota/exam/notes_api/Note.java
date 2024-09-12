package com.ota.exam.notes_api;

public class Note {
    
    private Long id;
  
    private String msg; 
  
    public Long getId() { 
        return id; 
    } 
  
    public void setId(Long id) { 
        this.id = id; 
    } 
  
    public String getMsg() { 
        return msg; 
    }
  
    public void setMsg(String msg) { 
        this.msg = msg; 
    }
}
