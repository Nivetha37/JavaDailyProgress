/* The doctor prescribed Chef to take a multivitamin tablet 3 times a day for the next X days.
Chef already has Y multivitamin tablets.
Determine if Chef has enough tablets for these X days or not.*/
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
		    if(x*3 <= y) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
