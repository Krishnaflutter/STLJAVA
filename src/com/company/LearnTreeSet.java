package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        // stores in a sorted manner
        // NOTE : can use Collections.reverseOrder to sort in desc order

        // adding to set
        set.add(23);
        set.add(23);
        set.add(11);
        set.add(56);
        set.add(11);
        set.add(1);

        System.out.println(set);

        // to check if something is present in set returns -> boolean
        System.out.println(set.contains(1));

        // to remove a given element from set logn operation unlike HashSet
        set.remove(1);

        System.out.println(set);

        // to iterate over set
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();

        Integer arr[] = new Integer[set.size()];

        // converting a set to array using the toArray method
        set.toArray(arr);

        for(Integer i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        // to clear the entire set
        set.clear();

        System.out.println(set);
    }
}
