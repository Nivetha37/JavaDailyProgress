/*Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor
Returns

int: the number of beautiful days in the range*/
import java.util.*;

public class Solution{
    
    static int reverse(int num){
        int rev = 0;
        while(num>0){
            int dig = num%10;
            rev = rev*10+dig;
            num/=10;
        }
        return rev;
    }
    
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int i = m.nextInt();
        int j = m.nextInt();
        long k = m.nextInt();
        
        int n = Math.abs(j-i);
        int count = 0;
        
        for(int a = 0;a<=n;a++){
            int num = i+a;
            int rev = reverse(num);
            if(Math.abs(num - rev)%k==0) count++;
        }
        
        System.out.print(count);
    }
    
}
