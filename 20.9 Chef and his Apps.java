/*Chef's phone has a total storage of S MB.
  Also, Chef has 2 apps already installed on his phone which occupy X MB and Y MB respectively.
  He wants to install another app on his phone whose memory requirement is Z MB.
  For this, he might have to delete the apps already installed on his phone.
  Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.*/
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
		    int s = m.nextInt();
		    int x = m.nextInt();
		    int y = m.nextInt();
		    int z = m.nextInt();
		    
		    System.out.println(s-(x+y)>=z?0:  s >= y+z ||s >=x+z?1:2);
		    
		}

	}
}
