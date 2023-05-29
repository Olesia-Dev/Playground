package com.playground.synchronization;

public class ThreadedSend extends Thread {

    private String message;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        message = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            sender.send(message);
        }
    }

}
