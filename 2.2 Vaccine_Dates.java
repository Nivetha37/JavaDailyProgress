/*Chef has taken his first dose of vaccine D days ago.
He may take the second dose no less than L days and no more than R days since his first dose.
Determine if Chef is too early, too late, or in the correct range for taking his second dose.
*/
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
		    int d = m.nextInt();
		    int l = m.nextInt();
		    int r = m.nextInt();
		    if(d<l){
		        System.out.println("Too Early");
		    }
		    else if(d>r){
		        System.out.println("Too Late");
		    }
		    else{
		        System.out.println("Take second dose now");
		    }
		}

	}
}
