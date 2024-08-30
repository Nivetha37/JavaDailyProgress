/*A participant can make 1 submission every 30 seconds. 
  If a contest lasts for X minutes, what is the maximum number of submissions that the participant can make during it?
  It is also given that the participant cannot make any submission in the last 5 seconds of the contest.*/
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
		    System.out.println((x*60)/30);
		}

	}
}
