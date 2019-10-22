package com.chaitu.spboot.ws.wssample.models;

import lombok.Data;

/**
 * Message
 */
@Data
public class Message {
    private String message;
    private String sender;
    private String type;
}