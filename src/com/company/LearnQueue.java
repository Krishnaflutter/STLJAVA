package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        // this is used to add elements to the queue --->> standard data structure
        q.offer(78);
        q.offer(56);
        q.offer(12);
        q.offer(14);
        q.offer(23);
        q.offer(45);

        // to view the front element of queue
        System.out.println(q.peek());

        // to pop the front element of the queue
        System.out.println(q.poll());

        // Returns the size of queue
        System.out.println(q.size());

        // Returns true if queue is empty and returns false if queue is not empty
        System.out.println(q.isEmpty());

        // printing queue using " toString " method
        System.out.println(q);

        // iterating over a queue
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }

        System.out.println(q);
    }
}
