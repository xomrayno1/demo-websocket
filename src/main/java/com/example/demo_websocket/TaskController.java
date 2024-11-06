package com.example.demo_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {
	@MessageMapping("/user")
	@SendTo("/topic/user")
	public UserResponse getUser(User user) {

		return new UserResponse("Hi " + user.getName());
	}
}
