package com.playground.thread;

public class ThreadPlayer extends Thread {

    public static void main(String[] args) {
        ThreadPlayer thread = new ThreadPlayer();
        thread.start();
        System.out.println("This code is outside of the thread!");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }

}

