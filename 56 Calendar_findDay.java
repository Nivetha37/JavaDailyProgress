/*You are given a date. You just need to write the method  findDay() , which returns the day on that date. 

Example:

month = october
date = 2
year = 2024

  Answer: day = WEDNESDAY

The method should return  as the day on that date.*/

import java.util.*;

public class Solution{
    
    public static String findDay(int month,int date,int year){
        
        String []days = {"","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        Calendar c = Calendar.getInstance();
        c.set(year,month,date);
        int day = c.get(c.DAY_OF_WEEK); 
        
        return days[day];
    }
    public static void main(String[] args){
        
        Scanner m = new Scanner(System.in);
        int month = m.nextInt();
        int date = m.nextInt();
        int year = m.nextInt();
        
        
        // months are zero based in calendar
        System.out.println(findDay(month-1,date,year));
        
        m.close();
        
    }
}
