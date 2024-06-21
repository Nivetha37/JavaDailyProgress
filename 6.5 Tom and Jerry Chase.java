/*In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.
  Jerry is running at a speed of X metres per second while Tom is chasing him at a speed of Y metres per second. 
  Determine whether Tom will be able to catch Jerry.*/
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
		    if(x<y) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
