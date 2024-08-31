/*Chef is looking to buy a TV and has shortlisted two models.
The first one costs A rupees, while the second one costs B rupees.
Since there is a huge sale coming up on Chefzon, Chef can get a flat discount of C rupees on the first TV, and a flat discount of D rupees on the second one.
Help Chef determine which of the two TVs would be cheaper to buy during the sale.*/
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
		    
		    if(a-c < b-d) System.out.println("First");
		    else if(a-c > b-d) System.out.println("Second");
		    else System.out.println("Any");
		
		}
	}
}
