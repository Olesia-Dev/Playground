package com.playground.thread;

public class UnpredictableIncrement extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {
        UnpredictableIncrement thread = new UnpredictableIncrement();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }

}
