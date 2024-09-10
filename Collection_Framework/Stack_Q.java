package JAVA.Collection_Framework;

import java.util.*;

public class Stack_Q {

    // Method to push an element at the bottom of the stack
    public static void PushatBottom(int data, Stack<Integer> S) {
        // Base case: if the stack is empty, push the element directly
        if (S.isEmpty()) {
            S.push(data);
            return;
        }

        // Recursively pop the top element and call PushatBottom with the remaining stack
        int top = S.pop();
        PushatBottom(data, S);

        // After the recursive call returns, push the top element back onto the stack
        S.push(top);
    }

    public static void main(String[] args) {
        // Initialize a stack and push elements onto it
        Stack<Integer> S = new Stack<>();
        S.push(11);
        S.push(12);
        S.push(13);

        // Push a new element at the bottom of the stack
        PushatBottom(14, S);

        // Print and pop all elements from the stack
        while (!S.isEmpty()) {
            System.out.println(S.peek()); // Print the top element
            S.pop(); // Remove the top element
        }
    }
}
