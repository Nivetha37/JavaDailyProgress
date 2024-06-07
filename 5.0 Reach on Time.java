/*Chef has recently moved into an apartment.
It takes 30 minutes for Chef to reach office from the apartment.
Chef left for the office X minutes before Chef was supposed to reach. 
Determine whether or not Chef will be able to reach on time.*/
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
		    if(x>=30){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
