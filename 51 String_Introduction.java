import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner m = new Scanner(System.in);
        String a = m.next();
        String b = m.next();

      // ........................................Sum the lengths of a and b
      
        int x = a.length();
        int y = b.length();
        System.out.println(x+y);
       
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        arr1[0] = Character.toUpperCase(arr1[0]);
        arr2[0] = Character.toUpperCase(arr2[0]);

      // .......................................write Yes if a is lexicographically greater than b otherwise print No instead.
      
         if(arr1[0] > arr2[0]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

      //......................................capitalize the first letter in both a and b and print them on a single line, separated by a space.
      
        System.out.print(String.valueOf(arr1)+" "+String.valueOf(arr2));
   
    }
}
