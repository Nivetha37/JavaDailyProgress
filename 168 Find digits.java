/*An integer  is a divisor of an integer  if the remainder of .

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example

Check whether ,  and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether , , and  are divisors of . All 3 numbers divide evenly into  so return .


Check whether  and  are divisors of .  is, but  is not. Return .

Function Description

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

int n: the value to analyze
Returns

int: the number of digits in  that are divisors of */
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        
        while(t-->0){
            int n = m.nextInt();
            int num = n;
            int count =0;
            
            while(n>0){
                int dig = n%10;
                if(dig!=0 && num%dig==0) count++;
                n=n/10;
            }
            
            System.out.println(count);
        }
        
    }
}
