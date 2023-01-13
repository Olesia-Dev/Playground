package com.playground.optional;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Alexandro", "ALEXANDRO@mail.com");

        // Stream-like approach
        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");

        System.out.println(email);

        // Regular approach
        if (person.getEmail().isPresent()) {
            String email2 = person.getEmail().get();
            System.out.println(email2.toLowerCase());

        } else {
            System.out.println("email not provided");
        }
    }

}
