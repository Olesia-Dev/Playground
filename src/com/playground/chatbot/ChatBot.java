package com.playground.chatbot;

import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Hi " + answer + "!");

        switch (answer) {
            case "Olesia":
                System.out.println("Slava Ukraini!");
                System.out.println("Would you like sing up in our chatbot?");
                break;
            case "Alex":
                System.out.println("Cool name!");
                System.out.println("What is your last name?");
                break;
            default:
                System.out.println(answer + "," + " Slava Ukraini!");
                break;
        }

        Scanner sc = new Scanner(System.in);
        String answerSecond = scanner.nextLine();
        System.out.println("Great! Welcome!");
    }

}
