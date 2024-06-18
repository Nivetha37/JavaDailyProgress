/*Alice, Bob, and Charlie are contributing to buy a Netflix subscription.
  However, Netfix allows only two users to share a subscription.
  Given that Alice, Bob, and Charlie have A, B, and C rupees respectively and a Netflix subscription costs X rupees.
  find whether any two of them can contribute to buy a subscription.*/
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
		    int x = m.nextInt();
		    if(a+b >=x || b+c >=x || a+c >=x) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
