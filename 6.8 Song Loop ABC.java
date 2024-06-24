/*Chef's playlist contains 3 songs named A,B, and C, each of duration exactly X minutes. 
  Chef generally plays these 3 songs in loop, i.e, A→B→C→A→B→C→A→…
  Chef went on a train journey of N minutes and played his playlist on loop for the whole journey. 
  How many times did he listen to the song C completely?*/
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
		    int n = m.nextInt();
		    int x = m.nextInt();
		    System.out.println((n/x)/3);
		    
		}

	}
}

