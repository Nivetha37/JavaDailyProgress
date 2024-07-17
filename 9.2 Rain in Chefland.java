/*In Chefland, precipitation is measured using a rain gauge in millimetre per hour.
Chef categorises rainfall as: LIGHT, if rainfall is less than 3 millimetre per hour.
MODERATE, if rainfall is greater than equal to 3 millimetre per hour and less than 7 millimetre per hour.
HEAVY if rainfall is greater than equal to 7 millimetre per hour.
Given that it rains at X millimetre per hour on a day, find whether the rain is LIGHT, MODERATE, or HEAVY.*/
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
		    if(x<3) System.out.println("LIGHT");
		    else if(x>=3 && x<7) System.out.println("MODERATE");
		    else System.out.println("HEAVY");
		}

	}
}
