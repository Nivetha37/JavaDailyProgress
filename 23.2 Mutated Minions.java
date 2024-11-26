/*Gru has not been in the limelight for a long time and is, therefore, planning something particularly nefarious.
Frustrated by his minions' incapability which has kept him away from the limelight, he has built a transmogrifier — a machine which mutates minions.
Each minion has an intrinsic characteristic value (similar to our DNA), which is an integer. 
The transmogrifier adds an integer K to each of the minions' characteristic value.
Gru knows that if the new characteristic value of a minion is divisible by 7, then it will have Wolverine-like mutations.
Given the initial characteristic integers of N minions, all of which are then transmogrified, find out how many of them become Wolverine-like.*/
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
		    int count =0;
		    while(n-->0){
		        int a = m.nextInt();
		        if((a+k)%7==0) count++;
		    }
		    System.out.println(count);
		}

	}
}
