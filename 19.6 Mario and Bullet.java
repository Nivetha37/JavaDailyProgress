/*Mario's bullet moves at X pixels per frame.
  He wishes to shoot a goomba standing Y pixels away from him. 
  The goomba does not move.
  Find the minimum time (in seconds) after which Mario should shoot the bullet, such that it hits the goomba after at least Z seconds from now.*/
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
		    int z = m.nextInt();
		    System.out.println(y/x >=z?0:z-(y/x));
		}
		

	}
}
