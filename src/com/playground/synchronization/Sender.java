package com.playground.synchronization;

public class Sender {

    public void send(String message) {
        System.out.println("Sending\t" + message);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + message + "Sent");
    }

}
