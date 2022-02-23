package com.company;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> map =  new TreeMap<>(Collections.reverseOrder());
        // Stores key value pairs in sorted order -> default is ASC
        // To store in DESC we can use Collections.reverseOrder()
        // Decides ASC or DSC on the basis of KEY (not Value)

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);

        // Iterating over a map
        for(Map.Entry<String,Integer> i:map.entrySet()){
            System.out.println("Key : "+i.getKey()+" , Value : "+i.getValue());
        }



    }
}
