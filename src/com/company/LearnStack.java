package com.company;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);

        // sets the 0 index with the value 11 --->> can be done but does not make sense on Stack
        st.set(0,11);

        System.out.println(st);

        // View the element at top
        System.out.println(st.peek());

        // Pop out the element at top  -->> returns the element that was poped out , null if empty
        System.out.println(st.pop());

        // View element at top
        System.out.println(st.peek());

        System.out.println("Talks about the actual size of stack  : " + st.size());

        System.out.println("Talks about the capacity (storage allocated to stack) of stack  : " + st.capacity());

        // to check if stack is empty --->> returns true if empty and false if not empty
        System.out.println(st.isEmpty());


        // Now to iterate over a stack

        while(!st.isEmpty()){
            System.out.println("Top removed : "+ st.pop());
        }


        // it becomes empty after removing all elements
        System.out.println(st);
    }
}
