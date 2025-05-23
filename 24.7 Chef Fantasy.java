/*All of Chef's friends are playing fantasy cricket based upon the ODI World Cup, and Chef would like to join them.
For a certain cricket match, Chef has decided upon his team of 11 players.
However, he hasn't yet decided who should be the captain and who should be the vice-captain.
He's narrowed his decision down to N players out of the 11, from which he'll choose one to be the captain and one to be the vice captain.
How many different choices does he have?*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int Fact(int n){
       if(n==1 || n==0) return 1;
       return n*Fact(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		int r = Fact(2);
		while(t-->0){
		    int n = m.nextInt();
		    System.out.println(Fact(n)/Fact(n-2));
		}

	}
}

/*   (or)
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
		    System.out.println(n*(n-1));
		}

	}
}
*/
