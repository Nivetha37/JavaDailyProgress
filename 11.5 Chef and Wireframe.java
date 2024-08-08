/*Chef has a rectangular plate of length Ncm and width Mcm. 
He wants to make a wireframe around the plate. The wireframe costs X rupees per cm.
Determine the cost Chef needs to incur to buy the wireframe.*/
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
		    int x = sc.nextInt();
		    System.out.println(2*(n+m)*x);
		}

	}
}
