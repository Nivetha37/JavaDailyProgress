/*There are G girl and B boy students at IIT (BHU) such that B>G.
If ICM were a team game where teams could only be of size 2, having exactly 1 girl student and 1 boy student,
what would be the minimum number of boy students from IIT (BHU) who would not be able to participate?*/
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
		    int g = m.nextInt();
		    int b = m.nextInt();
		    System.out.println(b-g);
		}

	}
}
