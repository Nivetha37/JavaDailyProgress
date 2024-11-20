/*The National Championships are starting soon. 
There are 4 race categories, numbered from 1 to 4, that Chef is interested in. 
Chef is participating in exactly 2 of these categories.
Chef has an arch-rival who is, unfortunately, the only person participating who is better than Chef, i.e, Chef can't defeat the arch-rival in any of the four race categories but can defeat anyone else.
Chef's arch-rival is also participating in exactly 2 of the four categories.
Chef hopes to not fall into the same categories as that of the arch-rival.
Given X,Y,A,B where X,Y are the races that Chef participates in, and A,B are the races that Chef's arch-rival participates in, find the maximum number of gold medals (first place) that Chef can win.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int  t = m.nextInt();
		while(t-->0){
		    int x = m.nextInt();
		    int y = m.nextInt();
		    int a = m.nextInt();
		    int b = m.nextInt();
		    System.out.println((x==a || x==b) && (y==a||y==b)?0:x!=a && x!=b && y!=a && y!=b?2:1);
		}

	}
}
