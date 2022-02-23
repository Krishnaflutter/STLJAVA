package com.company;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Heap Data Structure

        // NOTE : By default this stores min element on top , to store max on top ** Collections.reverseOrder **
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // add this to change priority "Collections.reverseOrder()"

        // Add elements top heap
        pq.offer(78);
        pq.offer(34);
        pq.offer(11);
        pq.offer(90);
        pq.offer(98);
        pq.offer(87);

        System.out.println(pq);

        // to view the top most element of heap
        System.out.println(pq.peek());

        // to pop/ remove the top most element of heap
        System.out.println(pq.poll());

        // to check if empty or not
        System.out.println(pq.isEmpty());

        // to iterate over a priority queue
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+ " "); // Just views
            System.out.println(pq.poll()); // removes
        }

        System.out.println(pq);




    }
}
