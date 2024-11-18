/*Chef bought N items from a shop. 
  Although it is hard to carry all these items in hand, so Chef has to buy some polybags to store these items.
1 polybag can contain at most 10 items. 
  What is the minimum number of polybags needed by Chef?*/
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
		    System.out.println((n-1)/10+1);
		}
	}
}
