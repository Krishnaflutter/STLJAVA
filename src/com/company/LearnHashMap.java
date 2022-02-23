package com.company;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        // Stores key value pairs similar to unordered_map in C++ , stores key value in random fashion
        // LinkedHashMap maintains the ordering , basically the order in which you insert into map
        // TreeMap maintains a sorted order of things inserted

        // adding to HashMap
        // to simply enter a key value pair
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        // to enter only if something is absent in the Hashmap
        map.putIfAbsent(1,"Hello"); // already present
        map.putIfAbsent(4,"Four"); // absent from map previously
        map.putIfAbsent(3,"YUIYUIUI"); // already present

        System.out.println(map);

        // To get a value corresponding to a key in the HashMap
        // Getting values against key that are sure to be present
        System.out.println(map.get(3));

        // Getting values against keys that might not be present in the map
        System.out.println(map.getOrDefault(5,"Five was Not Present though")); // not present in map
        System.out.println(map.getOrDefault(3,"Not printing bcoz already present")); // present in the map

        // To check if a key is present
        System.out.println(map.containsKey(4)); // 4 is present
        System.out.println(map.containsKey(5)); // 5 is not present

        // To check if a value is present
        System.out.println(map.containsValue("One")); // One value is present in the map
        System.out.println(map.containsValue("Five")); // Five value is not present in the map

        // Iterating over a map using it's keys
        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

        // Iterating over values inside map directly
        for(String s:map.values()){
            System.out.println(s);
        }


    }
}
