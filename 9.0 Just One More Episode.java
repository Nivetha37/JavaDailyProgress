/*Chef has to attend an exam that starts in X minutes, but of course, watching shows takes priority.
Every episode of the show that Chef is watching, is 24 minutes long.
If he starts watching a new episode now, will he finish watching it strictly before the exam starts?*/
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
		    if(x >24) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
