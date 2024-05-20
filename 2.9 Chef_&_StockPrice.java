/*
Chef wants to buy a stock whose price was S rupees when the market opened.
He will buy the stock if and only if its price is in the range [A,B].
The price of the stock has changed by C% by the time he was trying to buy the stock. Will he be able to buy the stock?
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t=m.nextInt();
		while(t-->0){
		    int s = m.nextInt();
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    
		    double new_price = s+(s*c/100.00);
		    
		    if(new_price >=a && new_price<=b){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
