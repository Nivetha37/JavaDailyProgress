/*Chef prepared two dishes yesterday. 
  Chef had assigned the tastiness T1 and T2 to the first and to the second dish respectively. 
  The tastiness of the dishes can be any integer between 0 and N (both inclusive).
  Unfortunately, Chef has forgotten the values of T1 and T2 that he had assigned to the dishes. 
  However, he remembers the sum of the tastiness of both the dishes - denoted by S.
  Chef wonders, what can be the maximum possible absolute difference between the tastiness of the two dishes.
  Can you help the Chef in finding the maximum absolute difference?

It is guaranteed that at least one pair {T1,T2} exist such that T1+T2=S,0≤T1,T2≤N.*/
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
		    int s = m.nextInt();
		    System.out.println(n>=s?s:2*n-s);
		    
		    //System.out.println(n-Math.abs(n-s));
		}

	}
}
