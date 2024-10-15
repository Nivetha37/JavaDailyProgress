/*Chef started watching a movie that runs for a total of X minutes.
Chef has decided to watch the first Y minutes of the movie at twice the usual speed as he was warned by his friends that the movie gets interesting only after the first Y minutes.
How long will Chef spend watching the movie in total?
Note: It is guaranteed that Y is even.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int x = m.nextInt();
		int y = m.nextInt();
		System.out.println( y/2+x-y);

	}
}
