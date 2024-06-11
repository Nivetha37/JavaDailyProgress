/*Chef took an examination two times.
In the first attempt, he scored X marks while in the second attempt he scored Y marks.
According to the rules of the examination, the best score out of the two attempts will be considered as the final score.*/

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
		    if(x>y) System.out.println(x);
		    else System.out.println(y);
		}

	}
}
