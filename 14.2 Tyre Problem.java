/*There are N bikes and M cars on the road.
Each bike has 2 tyres.
Each car has 4 tyres.
Find the total number of tyres on the road.*/
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
		    System.out.println(n*2+m*4);
		}

	}
}
