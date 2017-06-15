package com.epam.stationary.controller;

import com.epam.stationary.model.Message;

public class MessageController {
	
	public Message model = new Message();
	public String getMessage() {
       
       	return model.getMessage();
    }
    
    public void writeMessage(String message) {
        try {
            model.setMessage(message);
        } catch (Exception er) {
        	System.out.println("Exception thrown  :" + er);
        }
    }
}
