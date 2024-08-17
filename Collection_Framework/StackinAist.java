package JAVA.Collection_Framework;
import java.util.*;
public class StackinAist {
    static class Stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;}
                return  list.get(list.size()-1);

        }
    }
    public static void main(String[] args) {
        Stack S=new Stack();
        S.push(11);
        S.push(12);
        S.push(13);
        S.push(14);
        while(!S.isEmpty()) {
            System.out.println(S.peek());
            S.pop();

        }

        }
}
 
