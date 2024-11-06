package com.example.demo_websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class ApiController {
	
	@Autowired
    private SimpMessageSendingOperations messagingTemplate;
	
	@PostMapping
	public ResponseEntity<String> sendNotification(@RequestBody String message){
		
		messagingTemplate.convertAndSend("/topic/user", message);
		
		return ResponseEntity.ok("success");
	}

}
