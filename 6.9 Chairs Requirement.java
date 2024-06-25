/*Chef's coding class is very famous in Chefland.
  This year X students joined his class and each student will require one chair to sit on. 
  Chef already has Y chairs in his class.
  Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.*/
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
		    if(y>x) System.out.println(0);
		    else System.out.println(x-y);
		}

	}
}
