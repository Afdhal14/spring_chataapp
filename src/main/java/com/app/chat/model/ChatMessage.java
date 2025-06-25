package com.app.chat.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChatMessage {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;
    private String sender;
    private String content;

    public ChatMessage(String content, String sender, long id) {
        this.content = content;
        this.sender = sender;
        this.id = id;
    }
}
