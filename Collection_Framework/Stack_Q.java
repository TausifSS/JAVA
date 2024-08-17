package JAVA.Collection_Framework;
import java.util.*;
public class Stack_Q {
    public static void PushatBottom(int data,Stack<Integer>S){
        if (S.isEmpty()){
            S.push(data);
            return;
        }
        int top=S.pop();
        PushatBottom(data, S);
        S.push(top);
    }
       public static void main(String[] args) {
           Stack<Integer>S=new Stack<>();
           S.push(11);
           S.push(12);
           S.push(13);
           PushatBottom(14,S);
           while(!S.isEmpty()) {
               System.out.println(S.peek());
               S.pop();
   
           }
   
           }
}
