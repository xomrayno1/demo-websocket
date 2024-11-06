package com.example.demo_websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class DataHandler extends TextWebSocketHandler {
	
	private static final Logger log = LoggerFactory.getLogger(DataHandler.class);

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		log.info("Message : {} ", message.getPayload());
		session.sendMessage(new TextMessage("xin chào"));
	}
}
