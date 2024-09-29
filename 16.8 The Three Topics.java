/*The Chef has reached the finals of the Annual Inter-school Declamation contest.
For the finals, students were asked to prepare 10 topics.
However, Chef was only able to prepare three topics, numbered A, B and C — he is totally blank about the other topics.
This means Chef can only win the contest if he gets the topics A, B or C to speak about.
On the contest day, Chef gets topic X. 
Determine whether Chef has any chances of winning the competition.
Print "Yes" if it is possible for Chef to win the contest, else print "No".
You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		int b = m.nextInt();
		int c = m.nextInt();
		int x = m.nextInt();
		
		System.out.println(a==x || b==x ||c==x?"Yes":"No");

	}
}
