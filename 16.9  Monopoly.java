/*There are 4 companies in the markets of Chefland, A, B, C, and D.
This year,Company A made a profit of P lakh rupees,Company B made a profit of Q lakh rupees,Company C made a profit of R lakh rupees,Company D made a profit of S lakh rupees.
There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
Determine if there is a monopoly in the market or not.*/

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
		    int p = m.nextInt();
		    int q = m.nextInt();
		    int r = m.nextInt();
		    int s = m.nextInt();
		    
		    int sum = p+q+r+s;
		    
		    System.out.println(sum-p<p || sum-q<q || sum-r<r || sum-s<s?"YES":"NO");
		    
		    //Method 2 
		    
		    /*int [] arr = new int[4];
		    int max = 0,sum=0;
		    for(int i=0;i<4;i++){
		        arr[i] = m.nextInt();
		        max = Math.max(max,arr[i]);
		        sum = sum+arr[i];
		    }
		    System.out.println(sum-max < max?"YES":"NO");*/
		}

	}
}
