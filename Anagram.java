package JAVA;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
         String str1="listen";
        String str2="silent";

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[]array=str1.toCharArray();
        char[]array2=str2.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);

        if (Arrays.equals(array,array2)){
            System.out.println("your String is Anagrams");
        }else {
            System.out.println("you Stirng is Nort Anagram");
        }
          }
}
