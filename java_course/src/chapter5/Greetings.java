package chapter5;

import java.util.Scanner;

/*
Our first method
Write a method that asks for a user's name and greets them by name
 */
public class Greetings {

    public static void main(String args[]){

        System.out.println("Enter Name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
        scanner.close();
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name + "!");
    }
}
