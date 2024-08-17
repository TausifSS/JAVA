package JAVA;
import java.util.*;
public class StackClass {
    static class node{
        int data;
        node next;
         public node(int data){
             this.data=data;
             next=null;
         }
    }
    static class Stack{
        public static node head;
        public static boolean isEmpty(){
            return head==null;
        }
            public static void push(int data){
                node newnode=new node(data);
                if (isEmpty()) {
                    head = newnode;
                    return;
                    
                }
                newnode.next=head;
                head =newnode;
            }
            public static int pop(){
                if (isEmpty()) {
                    return-1;
                }
                int top=head.data;
                head=head.next;
                return top;
            }
            public static int peek(){
                if (isEmpty()) {
                    return-1;
                }
            return head.data;
            }
        

        }


    public static void main(String[] args) {
        Stack S=new Stack();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
while(!S.isEmpty()) {
    System.out.println(S.peek());
    S.pop();
    
        }
    }   
}
 