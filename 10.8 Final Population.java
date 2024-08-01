/*There were initially X million people in a town, out of which Y million people left the town and Z million people immigrated to this town.
Determine the final population of town in millions.*/
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
		    int z = m.nextInt();
		    System.out.println(x-y+z);
		}
	}
}
