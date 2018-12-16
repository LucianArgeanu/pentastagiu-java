package com.week3.exercise4;

public class Application {
    User user;

    public Application() {
        System.out.println("The application has been created.");
    }

    public User getUser() {
        return user;
    }

    public void addUser(User user){
        System.out.println("The user " + user.getName() + " has been added to the application with the email " + user.getEmail());
    }
}
