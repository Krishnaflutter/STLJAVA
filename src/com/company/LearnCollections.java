package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        List<Double> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add((int)(Math.random()*100*(i+1)));
            arr.add(Math.random()*10);
        }

        System.out.println(list);

        Collections.sort(list,new Sort());
        System.out.println("Lets sort the list : ");
        System.out.println(list);

        System.out.println("Max in list : " + Collections.max(list));

        System.out.println("Min in list : " + Collections.min(list));

        System.out.println("Lets reverse the list by reverse function in collections!!!");

        Collections.reverse(list);

        System.out.println(list);

        System.out.println(arr);

        Collections.sort(arr,new SortDouble());

        System.out.println(arr);
    }
}

class Sort implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1; // DESC order for ASC ---> o1-o2
    }
}

class SortDouble implements Comparator<Double>{
    @Override
    public int compare(Double o1, Double o2) {
        return Double.compare(o1,o2);  // ASC order but for DESC order ---> Double.compare(o2,o1);
    }
}
