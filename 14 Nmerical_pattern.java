import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        \\loop to get inputs
       
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int pow = 1;
            int term =0;

            \\loop to print the series

            for(int j=0;j<n;j++){
                int next = b*pow;
                term = term+next;
                System.out.print(term+a+" ");
                pow= pow*2;
            }
            System.out.println();
            
        }
        
        in.close();
    }
}