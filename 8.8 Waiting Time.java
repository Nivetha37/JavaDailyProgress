/*Chef is eagerly waiting for a piece of information. His secret agent told him that this information would be revealed to him after K weeks.
X days have already passed and Chef is getting restless now. Find the number of remaining days Chef has to wait for, to get the information.
It is guaranteed that the information has not been revealed to the Chef yet.*/
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
		    int k = m.nextInt();
		    int x = m.nextInt();
		    System.out.println(k*7-x);
		}

	}
}
