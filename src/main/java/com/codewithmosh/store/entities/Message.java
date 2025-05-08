package com.codewithmosh.store.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}

