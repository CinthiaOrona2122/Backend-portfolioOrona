package com.portfolioManagerAP.portfoliobackend.dto;

public class MessagesDto {
    
    private String message;
    
    public MessagesDto(String message){
        this.message = message;        
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    } 
    
}
