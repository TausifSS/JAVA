package JAVA.Collection_Framework;
import java.util.*;
public class Reverse_St {
    public static void PushatBottom(int data,Stack<Integer>S){
        if (S.isEmpty()){
            S.push(data);
            return;
        }
        int top=S.pop();
        PushatBottom(data, S);
        S.push(top);
    }
    public static void Reverse(Stack<Integer>S){
        if (S.isEmpty()){
            return;
        }
        int top=S.pop();
        Reverse(S);
        PushatBottom(top,S);
    }
    public static void main(String[] args) {
        Stack<Integer>S=new Stack<>();
        S.push(11);
        S.push(12);
        S.push(13);
        Reverse(S);
        while(!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();

        }

    }
}
