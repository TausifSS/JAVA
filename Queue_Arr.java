package JAVA;
import java.util.*;
public class Queue_Arr{
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        queue(int n){
            arr=new int[n];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
            //Add
        public static void Add(int data){
            if(rear ==size-1){
                System.out.println("Full");
                return;
            }
            rear++;
            arr[rear]=data;
            //remove
        }
        public static int remove(){
            if (isEmpty()){
                return -1;
            }
            int front =arr[0];
            for (int i=0;i<size;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void PushatBottom(int data,Stack<Integer>S){

        queue Q=new queue(5);
        Q.Add(1);
        Q.Add(2);
        Q.Add(3);
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }

    } 
}