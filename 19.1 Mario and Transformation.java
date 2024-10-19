/*Mario transforms each time he eats a mushroom as follows:

If he is currently small, he turns normal.
If he is currently normal, he turns huge.
If he is currently huge, he turns small.
Given that Mario was initially normal, find his size after eating X mushrooms.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		String arr[] = {"NORMAL","HUGE","SMALL"};
		
		int t = m.nextInt();
		while(t-->0){
		    int x = m.nextInt();
		    x = x%3;
		    System.out.println(arr[x]);
		}

	}
}
