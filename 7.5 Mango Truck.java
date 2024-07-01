/*You are given that a mango weighs X kilograms and a truck weighs Y kilograms. 
You want to cross a bridge that can withstand a weight of Z kilograms.
Find the maximum number of mangoes you can load in the truck so that you can cross the bridge safely.*/

/* METHOD 1 :
int x = m.nextInt();
int y = m.nextInt();
int z = m.nextInt();
int count = 0,a = x;
while(x+y <= z){
	count++;
  x+=a; 
}
System.out.println(count); */

/*METHOD:2*/
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
		    int z = m.nextInt();
		    System.out.println((z-y)/x);
		}

	}
}
