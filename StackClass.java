package JAVA;
import java.util.*;

public class StackClass {

    // Node class representing each element in the stack
    static class node {
        int data; // Data stored in the node
        node next; // Reference to the next node

        // Constructor to initialize the node with data
        public node(int data) {
            this.data = data;
            next = null; // By default, the next node is set to null
        }
    }

    // Stack class implementing stack operations using linked list
    static class Stack {
        public static node head; // Reference to the top node (head) of the stack

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            return head == null; // If head is null, the stack is empty
        }

        // Method to push a new element onto the stack
        public static void push(int data) {
            node newnode = new node(data); // Create a new node with the given data
            if (isEmpty()) {
                head = newnode; // If stack is empty, set the new node as the head
                return;
            }
            newnode.next = head; // Link the new node to the current head
            head = newnode; // Update the head to be the new node
        }

        // Method to pop the top element from the stack
        public static int pop() {
            if (isEmpty()) {
                return -1; // Return -1 if the stack is empty
            }
            int top = head.data; // Store the data of the top node
            head = head.next; // Move the head to the next node (removing the top node)
            return top; // Return the popped element
        }

        // Method to peek (view) the top element of the stack without removing it
        public static int peek() {
            if (isEmpty()) {
                return -1; // Return -1 if the stack is empty
            }
            return head.data; // Return the data of the top node
        }
    }

    public static void main(String[] args) {
        Stack S = new Stack(); // Create a new stack instance

        // Push elements onto the stack
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);

        // Pop elements from the stack until it is empty
        while (!S.isEmpty()) {
            System.out.println(S.peek()); // Print the top element
            S.pop(); // Remove the top element
        }
    }   
}
