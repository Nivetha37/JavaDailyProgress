/*The summer is at its peak in Chefland.
Chef is planning to purchase a water cooler to keep his room cool.
He has two options available:
- Rent a cooler at the cost of X coins per month.
- Purchase a cooler for Y coins.
Chef wonders what is the maximum number of months for which he can rent the cooler such that the cost of renting is strictly less than the cost of purchasing it.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t  = m.nextInt();
		while(t-->0){
		    int x = m.nextInt();
		    int y = m.nextInt();
		    
		    System.out.println(y%x==0?y/x-1:y/x);
		}

	}
}
