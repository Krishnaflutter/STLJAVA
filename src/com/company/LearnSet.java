package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        // this does not allow you to store duplicates
        // NOTE : stores numbers in a random order
        // TIP : use a LinkedHashSet to maintain the order
        Set<Integer> set = new HashSet<>();

        set.add(11);
        set.add(77);
        set.add(11);
        set.add(77);
        set.add(33);
        set.add(55);
        set.add(55);
        set.add(44);
        set.add(55);

        System.out.println(set);

        // size of set
        System.out.println(set.size());

        // checks whether the element is present in the set
        // returns true or false accordingly
        System.out.println("Contains 11 : " + set.contains(11));
        System.out.println("Contains 32 : " + set.contains(32));

        // to remove an element
        set.remove(11);

        // after removing
        System.out.println(set);

        // hashcode is the sum of all the hash values stored in it
        // usually used to compare whether to sets are equal
        System.out.println(set.hashCode());

    }
}

