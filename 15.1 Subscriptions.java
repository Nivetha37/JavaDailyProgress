/*A new TV streaming service was recently started in Chefland called the Chef-TV.
  A group of N friends in Chefland want to buy Chef-TV subscriptions.
  We know that 6 people can share one Chef-TV subscription. 
  Also, the cost of one Chef-TV subscription is X rupees. 
  Determine the minimum total cost that the group of N friends will incur so that everyone in the group is able to use Chef-TV.*/

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
		    System.out.println(n%6 == 0? (n/6)*x : ((n/6)+1)*x);
		    
		    //if(n%6==0) System.out.println((n/6)*x);
		    //else System.out.println(((n/6)+1)*x);
		}

	}
}
