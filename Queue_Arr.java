package JAVA;
import java.util.*;

public class Queue_Arr {

    // Static inner class to implement a queue using an array
    static class queue {
        static int arr[];  // Array to store queue elements
        static int size;   // Maximum size of the queue
        static int rear = -1;  // Rear pointer to track the end of the queue

        // Constructor to initialize the queue with a given size
        queue(int n) {
            arr = new int[n];
            this.size = n;  // Set the size of the queue
        }

        // Method to check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1;  // If rear is -1, the queue is empty
        }

        // Method to add an element to the queue
        public static void Add(int data) {
            // Check if the queue is full
            if (rear == size - 1) {
                System.out.println("Full");  // Print "Full" if the queue is at capacity
                return;
            }
            rear++;           // Increment rear pointer
            arr[rear] = data; // Add the new element at the rear
        }

        // Method to remove an element from the queue
        public static int remove() {
            // Check if the queue is empty
            if (isEmpty()) {
                return -1;  // Return -1 if the queue is empty
            }
            int front = arr[0];  // Store the front element to return later

            // Shift all elements in the queue one position to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;  // Decrement rear pointer since one element is removed
            return front;  // Return the removed front element
        }

        // Method to peek at the front element of the queue without removing it
        public static int peek() {
            // Check if the queue is empty
            if (isEmpty()) {
                return -1;  // Return -1 if the queue is empty
            }
            return arr[0];  // Return the front element
        }
    }

    // Method to demonstrate queue operations
    public static void PushatBottom(int data, Stack<Integer> S) {
        // Create a new queue with a capacity of 5
        queue Q = new queue(5);
        
        // Add elements to the queue
        Q.Add(1);
        Q.Add(2);
        Q.Add(3);

        // Remove and print each element from the queue until it is empty
        while (!Q.isEmpty()) {
            System.out.println(Q.peek()); // Print the front element
            Q.remove(); // Remove the front element
        }
    }
}
