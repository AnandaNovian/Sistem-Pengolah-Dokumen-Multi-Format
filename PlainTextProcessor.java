package com.example.txt;

import com.example.core.DocumentProcessor;

public class PlainTextProcessor implements DocumentProcessor {

    @Override
    public String process(String content) {
        return "Processed Plain Text: " + content.toUpperCase();
    }

    @Override
    public String getFormatName() {
        return "Plain Text";
    }
}
