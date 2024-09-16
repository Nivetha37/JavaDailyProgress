/*Chef has three water bottles. 
  At any point, if at least two of them are empty, she will fill them up. 
  But if at most one bottle is empty, she will wait, and not fill them up now.

  You are given three integers - B1,B2, and B3.

  If B1=1, it means that the first bottle is full.
  If B1=0, it means that the first bottle is empty.

  Similarly, B2 denotes whether the second bottle is full or empty, and B3 denotes it for the third bottle.

Output "Water filling time", if Chef has to fill the bottles now. If not, output "Not now".*/

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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    
		    //if(a!=0 && b!=0 || a!=0 && c!=0 || b!=0 && c!=0) System.out.println("Not now");
		    //else System.out.println("Water filling time");
		    
		    System.out.println( (a+b+c<2) ? "Water filling time" : "Not now");
		}

	}
}

