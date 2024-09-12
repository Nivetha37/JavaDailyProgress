/*Recently Chef joined a new company. In this company, the employees have to work for X hours each day from Monday to Thursday.
  Also, in this company, Friday is called Chill Day — employees only have to work for Y hours (Y<X) on Friday.
  Saturdays and Sundays are holidays.
  Determine the total number of working hours in one week.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int x = m.nextInt();
		    int y = m.nextInt();
		    System.out.println(x*4+y);
		}

	}
}
