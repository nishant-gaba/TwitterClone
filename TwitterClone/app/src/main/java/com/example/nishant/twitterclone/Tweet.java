package com.example.nishant.twitterclone;

public class Tweet {

    private String message;
    private String author;

    public Tweet() {

    }
    public Tweet(String message, String author) {
        this.message = message;
        this.author = author;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
