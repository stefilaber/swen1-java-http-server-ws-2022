package org.example.server;

public class Response {

    private int status;

    private String message;

    private String contentType;

    private String content;
    public void setStatus(int status){
        this.status = status;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
