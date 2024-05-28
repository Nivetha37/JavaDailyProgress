/*
Chef has been working hard to compete in MasterChef.
He is ranked X out of all contestants.
However, only 10 contestants would be selected for the finals.
Check whether Chef made it to the top 10 or not?
  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner m = new Scanner(System.in);
	    int t = m.nextInt();
	    while(t-->0){
	        int x = m.nextInt();
	        if(x<=10){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}
