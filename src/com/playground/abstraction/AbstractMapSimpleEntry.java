package com.playground.abstraction;

import java.util.AbstractMap;
import java.util.ArrayList;

public class AbstractMapSimpleEntry {

    @SuppressWarnings({"unchecked", "rawtypes"})

    public static void main(String[] args) {
        ArrayList<AbstractMap
                .SimpleEntry<Integer, Integer>>
                arrayList
                = new ArrayList<>();

        arrayList.add(new AbstractMap.SimpleEntry(0, 27));
        arrayList.add(new AbstractMap.SimpleEntry(1, 6));
        arrayList.add(new AbstractMap.SimpleEntry(2, 31));

        for (int i = 0; i < arrayList.size(); i++) {
            AbstractMap.SimpleEntry<Integer, Integer>
                    map = arrayList.get(i);
            String value = map.toString();
            System.out.println(value);
        }
    }

}
