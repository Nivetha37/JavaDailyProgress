/*There are two exits in a bus with 100 seats:
First exit is located beside seat number 1.
Second exit is located beside seat number 100.
Seats are arranged in a straight line from 1 to 100 with equal spacing between any 2 adjacent seats.
A passenger prefers to choose the nearest exit while leaving the bus.
Determine the exit taken by passenger sitting on seat X.*/
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
		    System.out.println(x>50?"RIGHT":"LEFT");
		}

	}
}
