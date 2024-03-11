import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
        Scanner m = new Scanner(System.in);
        int linenum=0;
      
        while(m.hasNext()){
            linenum++;
            String str=m.nextLine();
            System.out.println(linenum+" "+str);
        }
    }
}
