/*There is a bus with 30 seats.
  The seats are numbered from 1 to 30, and the numbering is as depicted in this image.

 As can be seen in the image, the bus is divided into two decks - The Lower deck, and the Upper deck, with 15 seats each. 
  And some of the seats come as Single and some as Double. 
  For example, Seats 1 and 2 are Double, whereas Seat 11 is a Single.

You will be given a Seat number, and your job is to classify it as one of these 4 types:

Lower Single
Lower Double
Upper Single
Upper Double*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m  = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int n = m.nextInt();
		    
		    System.out.println(n>15?n>25?"Upper Single":"Upper Double":n<11?"Lower Double":"Lower Single");
		}

	}
}
