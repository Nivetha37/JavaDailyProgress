/*
Given a string S and two indices(start and end).
print a substring consisting of all characters in the inclusive range from start to end-1.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        char [] arr = S.toCharArray();
        for(int i = start;i<end;i++){
            System.out.print(arr[i]);
        }
    
    }
}
