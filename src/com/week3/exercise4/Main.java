package com.week3.exercise4;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        System.out.println();
        User firstUser = new User("Alex", "alex@gmail.com");
        User secondUser = new User("Gabriela", "gabriela@gmail.com");
        User thirdUser = new User("Ilie", "ilie@gmail.com");

        application.addUser(firstUser);
        application.addUser(secondUser);
        application.addUser(thirdUser);

        System.out.println();
        firstUser.postMessage();
        secondUser.postMessage();
        thirdUser.postMessage();
    }
}
