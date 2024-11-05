/* Chef is playing with weights. 
He has an object weighing W units.
He also has three weights each of X,Y, and Z units respectively.
Help him determine whether he can measure the exact weight of the object with one or more of these weights.
If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.*/

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
		    int w = m.nextInt();
		    int x = m.nextInt();
		    int y = m.nextInt();
		    int z = m.nextInt();

		    System.out.println(x+y+z == w || x==w || y== w ||z == w||x+y==w||x+z==w||y+z==w?"YES":"NO");
		}

	}
}
