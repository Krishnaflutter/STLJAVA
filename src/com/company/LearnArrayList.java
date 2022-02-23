package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LearnArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // size of ArrayList is dynamically increased ->> at first it is 10
        // after 10 elements get added size increases as --->> n + n/2 + 1 therefore the new size is 16

        // Simply adds at the back of list
        list.add(23);
        list.add(32);
        list.add(12);
        list.add(11);
        list.add(1);
        list.add(88);

        // adds to the passed index of list
        list.add(2,65);

        // adding a new list of numbers to the old list again this adds to the end of list
        List<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(6);
        newList.add(7);
        list.addAll(newList);


        // adding a new list of numbers to old list at any given index
        newList.add(8);
        list.addAll(1,newList);

        // size of list
        System.out.println(list.size());

        // checks whether an element is present or absent in a list
        System.out.println(list.contains(12));

        // get helps to get the element at that index ->>> indexing is zero based
        System.out.println(list.get(1));

        // There are many ways to iterate over a list
        // index based for loop
        for(int i=0 ; i < list.size() ; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // simple for loop
        for(int x:list){
            System.out.print(x+" ");
        }
        System.out.println();

        // for loop with list iterator
        // you can pass an index from where you want to start iterating , the default value of index is zero
        ListIterator<Integer> it = list.listIterator(3);

        while(it.hasNext()){
            System.out.print(it.next()+" ,");
        }
        System.out.println();


        // list gets printed because a toString method has been predefined by Java
        System.out.println(list);

        // this is used to remove the given value if it is present
        // takes O(n) time
        list.remove(Integer.valueOf(12));
        System.out.println(list);

        // this is used to remove value at any given index
        // takes O(n) time
        list.remove(2);

        System.out.println(list);

        // using toArray to convert a list to an array object

        Integer arr[] = new Integer[list.size()];
        list.toArray(arr);


        // Now the array can be printed using toString method defined in Arrays class
        System.out.println(Arrays.toString(arr));

        // to clear the entire list
        list.clear();
        System.out.println(list);
    }
}
