/*Chef is playing a video game, and is now fighting the final boss.
The boss has H health points. Each attack of Chef reduces the health of the boss by X.
Chef also has a special attack that can be used at most once, and will decrease the health of the boss by Y.
Chef wins when the health of the boss is ≤0.
What is the minimum number of attacks needed by Chef to win?*/
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
		    int h = m.nextInt();
		    int x = m.nextInt();
		    int y = m.nextInt();
		    System.out.println((h-y)%x==0?(h-y)/x+1:(h-y)/x+2);
		}

	}
}
