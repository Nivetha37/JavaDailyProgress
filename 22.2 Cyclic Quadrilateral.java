/*You are given the sizes of angles of a simple quadrilateral (in degrees) A,B,C and D, in some order along its perimeter.
Determine whether the quadrilateral is cyclic.
Note: A quadrilateral is cyclic if and only if the sum of opposite angles is 180 degree.*/
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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    int d = m.nextInt();
		    System.out.println(a+c==180?"YES":"NO");
		}

	}
}
