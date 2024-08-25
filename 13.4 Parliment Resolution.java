/*An important resolution is being discussed in the Parliament of Chefland. 
There are N members present in the Parliament out of which X members voted in favour of the resolution and the remaining voted against it.
According to the constitution of Chefland, a resolution is passed if and only if half or more than half the members present in the Parliament vote in favour of the resolution.
Determine if the resolution is passed or not.*/
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
		    double n = m.nextDouble();
		    double x = m.nextDouble();
		    if(n/2 <= x) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
