/*Chef is standing at coordinate A while Chefina is standing at coordinate B.
In one step, Chef can increase or decrease his coordinate by at most K.
Determine the minimum number of steps required by Chef to reach Chefina.*/
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
		    int k = m.nextInt();
		    int d = Math.abs(a-b);
		    System.out.println(d%k==0?d/k:d/k+1);
		}

	}
}
