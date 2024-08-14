package JAVA;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // level 1;
        // Basic

        // Array

        int []number = new int[5];
//Another syntax;
// int number[] = new int [5];

        number[0]=58;
        number[1]=44;
        number[2]=55;

        // For All value Print;
        for (int i=0;i<5;i++){
            System.out.println(number[i]);
        }
        // For Normal Single value Print;
        System.out.println(number[2]);

        // level 2;
// Question for Java basic array
// Take an array as input from the user. Search for a given number x and print the index at which it occurs.
        System.out.println("Enter The size and value of Array");
        int size = sc.nextInt();
        int number2 [] = new int[size];
        for (int i=0;i<size;i++){
            number2[i]=sc.nextInt();
        }
        int x= sc.nextInt();

        for (int i=0;i<number2.length;i++){
            if (number2[i] == x){
                System.out.println("your x found at index : "+i);
            }

        }
    }
}
