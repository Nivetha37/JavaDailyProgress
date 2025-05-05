/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the  function with the following parameter(s):

: a time in  hour format
Returns

: the time in  hour format*/
import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        String s = m.nextLine().trim();
        
        // if given input is a.m
        if(s.endsWith("AM")){
            if(s.substring(0,2).equals("12")){
                System.out.print("00"+s.substring(2,s.length()-2));
            }
            else{
                System.out.print(s.substring(0,s.length()-2));
            }
        }
        
        // if given input is p.m
        
        else if(s.endsWith("PM")){
            if(s.substring(0,2).equals("12")){
                System.out.print(s.substring(0,s.length()-2));
            }
            else{
                int hour = Integer.parseInt(s.substring(0,2))+12;
                
                System.out.print(hour+s.substring(2,s.length()-2));
            }
        }
        
    }
}
