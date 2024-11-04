/* Chef is setting up a perfect bath for himself.
  He has X litres of hot water and Y litres of cold water.
  The initial temperature of water in his bathtub is A degrees. 
  On mixing water, the temperature of the bathtub changes as following:
     -The temperature rises by 1 degree on mixing 1 litre of hot water.
     -The temperature drops by 1 degree on mixing 1 litre of cold water.
Determine whether he can set the temperature to B degrees for a perfect bath.*/

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
		    int x = m.nextInt();
		    int y = m.nextInt();
		    
		    System.out.println(a>=b && (a-b)<=y ||a<b && (b-a)<=x?"YES":"NO");
		}

	}
}
