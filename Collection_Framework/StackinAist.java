package JAVA.Collection_Framework;

import java.util.*;

public class StackinAist {

    // Custom Stack class using ArrayList as the underlying data structure
    static class Stack {
        // ArrayList to store stack elements
        static ArrayList<Integer> list = new ArrayList<>();

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Method to push an element onto the stack
        public static void push(int data) {
            list.add(data); // Add the element to the end of the list
        }

        // Method to pop an element from the stack
        public static int pop() {
            // If the stack is empty, return -1 (or you could throw an exception)
            if (isEmpty()) {
                return -1;
            }

            // Get the top element of the stack (the last element in the list)
            int top = list.get(list.size() - 1);
            // Remove the top element from the stack
            list.remove(list.size() - 1);
            return top;
        }

        // Method to peek at the top element of the stack without removing it
        public static int peek() {
            // If the stack is empty, return -1 (or you could throw an exception)
            if (isEmpty()) {
                return -1;
            }
            // Return the top element of the stack
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Create a new instance of the Stack
        Stack S = new Stack();

        // Push elements onto the stack
        S.push(11);
        S.push(12);
        S.push(13);
        S.push(14);

        // While the stack is not empty, pop and print each element
        while (!S.isEmpty()) {
            System.out.println(S.peek()); // Print the top element
            S.pop(); // Remove the top element
        }
    }
}
