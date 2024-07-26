/*A person is said to be sleep deprived if he slept strictly less than 7 hours in a day.
Chef was only able to sleep X hours yesterday. Determine if he is sleep deprived or not.*/
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
		    if(x<7) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
