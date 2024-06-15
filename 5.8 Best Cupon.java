/*Chef is ordering food online (instead of cooking) and the bill comes out to be Rs. X. 
Chef can use one of the following two coupons to avail a discount.
     - Get 10 percent off on the bill amount
     - Get a flat discount of Rs. 100 on the bill amount
  What is the maximum discount Chef can avail?*/
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
		    int a = x*10/100; //using first coupon
		    
		    if(a>100) System.out.println(a);
		    else System.out.println(100);
		}

	}
}
