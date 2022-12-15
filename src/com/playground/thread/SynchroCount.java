package com.playground.thread;

public class SynchroCount {

    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SynchroCount synchroCount = new SynchroCount();
        Thread first = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                synchroCount.increment();
            }
        });
        Thread second = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                synchroCount.increment();
            }
        });

        first.start();
        second.start();
        Thread.sleep(1_000);
        System.out.println(synchroCount.counter);
    }

    private void increment() {
        synchronized (this) {
            counter++;
        }
    }

}
