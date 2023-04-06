package com.playground.statements;

public class ReturnMain {

    public static ReturnClass function(String message) {
        return new ReturnClass(message);
    }

    public static void main(String[] args) {
        ReturnClass obj = function("Good morning, Olesia!");
        obj.display();
    }

}
