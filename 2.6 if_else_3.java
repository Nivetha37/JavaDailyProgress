/*
Chef prepared a problem. The admin has rated this problem for x points.
A problem is called :

Easy if   : 1≤x<100
Medium if : 100≤x<200
Hard if   : 200≤x≤300

Find the category to which Chef’s problem belongs.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int x=m.nextInt();
		    if(x>=1 && x<100){
		        System.out.println("Easy");
		    }
		    else if(x>=100 && x<200){
		        System.out.println("Medium");
		    }
		    else{
		        System.out.println("Hard");
		    }
		}

	}
}
