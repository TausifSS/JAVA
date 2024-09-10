package JAVA;

import java.util.*;

public class TwoDarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task: Take a matrix as input from the user, search for a given number 'x', and print the indices where it occurs.

        // Step 1: Input the dimensions of the matrix (rows and columns)
        System.out.println("Enter the number of rows and columns: ");
        int rows = sc.nextInt(); // Number of rows in the matrix
        int cols = sc.nextInt(); // Number of columns in the matrix

        // Step 2: Initialize a 2D array (matrix) with the specified dimensions
        int[][] number = new int[rows][cols];

        // Step 3: Populate the matrix with user input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt(); // Input each element
            }
        }

        // Step 4: Prompt the user to enter the number they want to search for in the matrix
        System.out.println("Enter the number you are searching for:");
        int x = sc.nextInt(); // The number to search for in the matrix

        // Step 5: Search for the number 'x' in the matrix
        boolean found = false; // Flag to check if the number is found
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the number is found, print the indices
                if (number[i][j] == x) {
                    System.out.println("Your number is found at position: (" + i + ", " + j + ")");
                    found = true; // Set the flag to true if the number is found
                }
            }
        }

        // If the number is not found, print a message
        if (!found) {
            System.out.println("Number not found in the matrix.");
        }
    }
}
