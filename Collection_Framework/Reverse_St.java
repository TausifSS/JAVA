package JAVA.Collection_Framework;

import java.util.*;

public class Reverse_St {

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

    // Method to reverse the stack
    public static void Reverse(Stack<Integer> S) {
        // Base case: if the stack is empty, return
        if (S.isEmpty()) {
            return;
        }

        // Recursively pop the top element, reverse the remaining stack, and push the popped element at the bottom
        int top = S.pop();
        Reverse(S);
        PushatBottom(top, S);
    }

    public static void main(String[] args) {
        // Initialize a stack and push elements onto it
        Stack<Integer> S = new Stack<>();
        S.push(11);
        S.push(12);
        S.push(13);

        // Reverse the stack
        Reverse(S);

        // Print and pop all elements from the reversed stack
        while (!S.isEmpty()) {
            System.out.println(S.peek()); // Print the top element
            S.pop(); // Remove the top element
        }
    }
}
