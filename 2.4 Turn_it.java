/* Chef is playing Need For Speed.
Currently, his car is running on a straight road with a velocity U metres per second and approaching a 90 degree  turn which is S metres away from him.
To successfully cross the turn, velocity of the car when entering the turn must not exceed V metres per second.

The brakes of Chef's car allow him to slow down with a deceleration (negative acceleration) not exceeding A metres per squared second. 
Tell him whether he can cross the turn successfully.
The velocity v when entering the turn can be determined from Newton's 2nd law to be [ v^2 = u^2 - 2*a*s ]
 if the car is moving with a uniform acceleration a. */

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
		    int u = m.nextInt();
		    int v = m.nextInt();
		    int a = m.nextInt();
		    int s = m.nextInt();
		    
		    if(u <= v){
		        System.out.println("Yes");
		    }
		    else if(v*v >= u*u - 2*a*s){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
