package JAVA;

import java.util.Scanner;

public class StringR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reversed String;

        String original="ocia";
        String reversed ="";

        for (int i=original.length()-1;i>=0;i--){
            reversed+=original.charAt(i);
        }
        System.out.println("Original String is: "+original);
        System.out.println("Reversed String is: "+reversed);
        System.out.println("=======================================================================================================================================================");
        // Lets check Palindrome

        System.out.println("Enter String !");
        String user= sc.next();
        String Ruser="";

        for (int i=user.length()-1;i>=0;i--){
            Ruser+=user.charAt(i);
        }
        if (user.equals(Ruser)){
            System.out.println("Your String is Palindromic");
        }else{
            System.out.println("Your String is Not Palindromic");
        }
          }
}
