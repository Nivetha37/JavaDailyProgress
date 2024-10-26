/*Chef has N candies. 
  He has to distribute them to exactly M of his friends such that each friend gets equal number of candies and each friend gets even number of candies. 
  Determine whether it is possible to do so.

NOTE: Chef will not take any candies himself and will distribute all the candies.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    System.out.println(n%m==0  && (n/m)%2==0?"Yes":"No");
		}

	}
}
