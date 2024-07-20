/*Chef has recently started playing chess, and wants to play as many games as possible.
He calculated that playing one game of chess takes at least 20 minutes of his time.
Chef has N hours of free time. What is the maximum number of complete chess games he can play in that time?*/
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
		    System.out.println((n*60)/20);
		}

	}
}
