package com.playground.hashmap;

import java.util.HashMap;

public class Birthday {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Olesia", 31);
        map.put("Iryna", 11);
        map.put("Maria", 10);
        System.out.println("Birthdays of family members: " + map.size());
        System.out.println(map);

        if (map.containsKey("Olesia")) {
            Integer day = map.get("Olesia");
            System.out.println("Olesia " + "celebrates birthday on this day - " + day);
        }
    }

}
