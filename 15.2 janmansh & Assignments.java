/*Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm.
Each assignment takes him 1 hour to complete. 
Can you tell whether he'll be able to complete all assignments on time or not?*/

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
		    if(x+3 <= 10) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
