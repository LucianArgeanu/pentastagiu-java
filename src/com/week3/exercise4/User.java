package com.week3.exercise4;

public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public void postMessage(){
        System.out.println(getName() + " posted a message on the board");
    }
}
