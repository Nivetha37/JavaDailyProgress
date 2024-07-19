/*Chef was driving on a highway at a speed of X km/hour.
To avoid accidents, there are fine imposed on overspeeding as follows:
No fine if the speed of the car ≤70 km/hour.
Rs 500 fine if the speed of the car is strictly greater than 70 and ≤100.
Rs2000 fine if the speed of the car is strictly greater than 100.*/
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
		    if(x<=70) System.out.println(0);
		    else if(x>70 && x<=100) System.out.println(500);
		    else System.out.println(2000);
		}

	}
}
