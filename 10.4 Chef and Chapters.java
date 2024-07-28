/*This semester, Chef took X courses. 
Each course has Y units and each unit has Z chapters in it.
Find the total number of chapters Chef has to study this semester.*/

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
		    System.out.println(x*y*z);
		}

	}
}
