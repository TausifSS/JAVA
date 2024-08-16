package JAVA.Collection_Framework;
import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        //Add First;
        list.addFirst("My");
        //Add list
        list.add("name");
        //Add Last
        list.addLast("is");
        list.addLast("Tony");
        //Print List & size
            System.out.println(list);
            System.out.println(list.size());
        //Print all List
        for (int i=1;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
            System.out.println("Null");
        //Delete list
        list.removeLast();
            System.out.println(list);
        }
}
