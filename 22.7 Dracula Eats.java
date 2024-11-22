/*There are N spooky days left until Halloween.
Dracula dines at a mysterious restaurant that changes its spooky menu daily.
He particularly enjoys what they serve on Tuesday.
Today is Monday, so he wishes to calculate how many times he can indulge in his favourite menu in the next N days (including today) before Halloween.
Note that Dracula follows the standard 7-day calendar, with Tuesday immediately following Monday.*/
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
		    int n = m.nextInt();
		    System.out.println((n%7)<2?n/7:n/7+1);
		}
	}
}
