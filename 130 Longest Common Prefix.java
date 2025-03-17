/*You are given a list of strings str.
Your task is to find the longest common prefix among all the strings in the list. 
If there is no common prefix, return −1.*/

import java.util.*;

public class Main {

    public static String findPrefix(String[] str) {
        // Write your code here
        
        int n = str.length;
        int min = Integer.MAX_VALUE;
        String s = "";
        
        
        for(String i : str){
            if(i.length()<min){
                min = i.length();
            }
        }

        for (int i = 0; i < min; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (str[j].charAt(i) == str[j - 1].charAt(i)) count++;
                else break;
            }
            if (count == n) s += str[0].charAt(i);
            else break;
        }

        return s.length() > 0 ? s : "-1";
    }
    
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while(t-->0){
            int n = m.nextInt();
            String str[] = new String[n];
            for(int i=0;i<n;i++){
                str[i] = m.next();
            }
            
            
            System.out.println(findPrefix(str));
        }
    }
}
