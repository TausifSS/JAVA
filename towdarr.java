package JAVA;
import java.util.*;
public class TowDarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Q :Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
        System.out.println("Enter a values of Row and Column ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][]number = new int[rows][cols];

        for (int i=0; i<rows;i++){
            for (int j=0;j<cols;j++){
                number[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter your Searching number");
        int x = sc.nextInt();
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(number[i][j]==x){
                    if (number[i][j]==x){
                        System.out.print("you number found at "+ i +" "+j);
                    }

                }

            }
            System.out.println();
        }
    }
}