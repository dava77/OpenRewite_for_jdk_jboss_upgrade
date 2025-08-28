package com.example.demo2.dto;

public class SampleDTO {
    private String id;
    private String message;

    public SampleDTO() {}

    public SampleDTO(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}