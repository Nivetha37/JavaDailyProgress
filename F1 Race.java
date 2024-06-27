/*Chef has finally got the chance of his lifetime to drive in the F1 tournament.
But, there is one problem. Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.
Given the fastest finish time as X seconds and Chef's finish time as Y seconds, determine whether Chef will be allowed to race in the main event or not.
Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.*/
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
		    float x = m.nextInt();
		    float y = m.nextInt();
		    if(107.00/100.00 *x >= y) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
