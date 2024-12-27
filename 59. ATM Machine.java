/*There is an ATM machine. 
Initially, it contains a total of K units of money.
N people (numbered 1 through N) want to withdraw money; for each valid i, the i-th person wants to withdraw Ai units of money.
The people come in and try to withdraw money one by one, in the increasing order of their indices.
Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. 
Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.
For each person, determine whether they will get the required amount of money or not.*/
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
		    int k = m.nextInt();
		    for(int i=0;i<n;i++){
		        int a = m.nextInt();
		        if(a<=k){
		            k-=a;
		            System.out.print(1);
		        }
		        else System.out.print(0);
		    }
		    System.out.println();
		}

	}
}
