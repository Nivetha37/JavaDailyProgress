/*It's the sale season again and Chef bought items worth a total of X rupees.
  The sale season offer is as follows:

if X≤100, no discount.
if 100<X≤1000, discount is 25 rupees.
if 1000<X≤5000, discount is 100 rupees.
if X>5000, discount is 500 rupees.
  
Find the final amount Chef needs to pay for his shopping.*/

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
		    if(x<=100) System.out.println(x);
		    else if(x<=1000) System.out.println(x-25);
		    else if(x<=5000) System.out.println(x-100);
		    else  System.out.println(x-500);
		    
		}

	}
}
