/*Chef categorises an instagram account as spam, if, the following count of the account is more than 10 times the count of followers.
Given the following and follower count of an account as X and Y respectively, find whether it is a spam account.*/
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
		    if(x > y*10) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
