/*Chef wants to give a burger party to all his N friends i.e. he wants to buy one burger for each of his friends.
The cost of each burger is X rupees while Chef has a total of K rupees.
Determine whether he has enough money to buy a burger for each of his friends or not.*/
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
		    int k = m.nextInt();
		    if(n*x<=k) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
