/*In discus throw, a player is given 3 throws and the throw with the longest distance is regarded as their final score.
  You are given the distances for all 3 throws of a player.
  Determine the final score of the player.*/

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
		int arr[] = new int[3];
		while(t-->0){
		    int max = 0;
		    for(int i=0;i<3;i++){
		        arr[i] = m.nextInt();
		        max = Math.max(max,arr[i]);
		    }
		    
		    System.out.println(max);
		    
		}

	}
}
