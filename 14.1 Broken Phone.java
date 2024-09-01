/*Uttu broke his phone.
  He can get it repaired by spending X rupees or he can buy a new phone by spending Y rupees. 
  Uttu wants to spend as little money as possible. 
  Find out if it is better to get the phone repaired or to buy a new phone.*/
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
		    if(x<y) System.out.println("REPAIR");
		    else if(y<x) System.out.println("NEW PHONE");
		    else System.out.println("ANY");
		}

	}
}
