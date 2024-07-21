/*There is a fair going on in Chefland. Chef wants to visit the fair along with his N friends.
Chef manages to collect K passes for the fair.
Will Chef be able to enter the fair with all his N friends?
A person can enter the fair using one pass, and each pass can be used by only one person.*/import java.util.*;
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
		    int k = m.nextInt();
		    if(n<k) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
