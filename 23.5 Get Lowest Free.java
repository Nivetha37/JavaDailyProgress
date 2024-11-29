/*Chef goes to the supermarket to buy some items. 
  Luckily there's a sale going on under which Chef gets the following offer:
  If Chef buys 3 items then he gets the item (out of those 3 items) having the lowest price as free.
  For e.g. if Chef bought 3 items with the cost 6, 2 and 4, then he would get the item with cost 2 as free. 
  So he would only have to pay the cost of the other two items which will be 6+4=10.
  Chef buys 3 items having prices A,B and C respectively. 
  What is the amount of money Chef needs to pay?*/
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
		    
		    System.out.println(a>b?b>c?a+b:a+c:a>c?a+b:b+c);
		}
 
	}
}
