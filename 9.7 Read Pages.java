/*Chef has started studying for the upcoming test. The textbook has 𝑁 pages in total. 
Chef wants to read at most X pages a day for Y days.
Find out whether it is possible for Chef to complete the whole book.*/
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
		    int x = m.nextInt();
		    int y = m.nextInt();
		    if(x*y >= n) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
