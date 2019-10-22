package com.chaitu.spboot.ws.wssample.controlleres;

import com.chaitu.spboot.ws.wssample.models.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * MessageController
 */
@Controller
public class MessageController {

    Logger log = LoggerFactory.getLogger(MessageController.class);
    
    @MessageMapping("/send")
    @SendTo
    public String sendMessage(@Payload Message message) {
        log.info("Message: {}", message.toString());
        return "Hello From the other side " + message.getSender();
    }
}