/*Alice is driving from her home to her office which is A kilometers away and will take her X hours to reach.
Bob is driving from his home to his office which is B kilometers away and will take him Y hours to reach.
Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.*/
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
		    float a = m.nextInt();
		    float x = m.nextInt();
		    float b = m.nextInt();
		    float y = m.nextInt();
		    
		    System.out.println(a/x == b/y?"Equal":a/x<b/y?"Bob":"Alice");
		}

	}
}
