/*The Chessboard Distance for any two points (X1,Y1) and (X2,Y2) on a Cartesian plane is defined as max(∣X1−X2∣,∣Y1−Y2∣).
  You are given two points (X1,Y1) and (X2,Y2).
  Output their Chessboard Distance.
  Note that, ∣P∣ denotes the absolute value of integer P. 
  For example, ∣−4∣=4 and ∣7∣=7.*/
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
		    int x1 = m.nextInt();
		    int y1 = m.nextInt();
		    int x2 = m.nextInt();
		    int y2 = m.nextInt();
		    System.out.println(Math.max(Math.abs(x2-x1),Math.abs(y2-y1)));
		}

	}
}
