/*Chef is watching TV. The current volume of the TV is X. 
  Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1.
  Chef wants to change the volume from X to Y.
  Find the minimum number of button presses required to do so.*/
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
		    System.out.println(Math.abs(y-x));
		}

	}
}
