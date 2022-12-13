package com.playground.thread;

public class RunnablePlayer implements Runnable {

    public static void main(String[] args) {
        RunnablePlayer runnablePlayer = new RunnablePlayer();
        Thread thread = new Thread(runnablePlayer);
        thread.start();
        System.out.println("This code is outside of the thread!");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread.");
    }

}
