package JAVA;

import java.util.Scanner;

public class StringR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Section 1: Reverse a predefined string

        // Original string that will be reversed
        String original = "ocia";
        String reversed = "";  // Variable to store the reversed string

        // Loop through the original string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);  // Append each character to the reversed string
        }

        // Print the original and reversed strings
        System.out.println("Original String is: " + original);
        System.out.println("Reversed String is: " + reversed);

        System.out.println("=======================================================================================================================================================");

        // Section 2: Check if a user-inputted string is a palindrome

        System.out.println("Enter String !");
        String user = sc.next();  // Take input from the user
        String Ruser = "";  // Variable to store the reversed user string

        // Loop through the user string in reverse order
        for (int i = user.length() - 1; i >= 0; i--) {
            Ruser += user.charAt(i);  // Append each character to the reversed user string
        }

        // Compare the original user string with its reversed version
        if (user.equals(Ruser)) {
            System.out.println("Your String is Palindromic");  // If they are the same, it's a palindrome
        } else {
            System.out.println("Your String is Not Palindromic");  // If they are different, it's not a palindrome
        }
    }
}
