/*In the light of G-20 summit, government has decided to keep the average air quality index (AQI) strictly below 100.
On some random day, Chef measures the AQI and found the value to be X.
Find whether the government was able to keep the AQI within limits.*/
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
		if(x<100) System.out.println("YES");
		else System.out.println("NO");

	}
}
