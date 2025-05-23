/*The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Example



The method should return  as the day on that date.

image

Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters*/

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
