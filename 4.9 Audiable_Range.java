/* Chef's dog binary hears frequencies starting from 67 Hertz to 45000 Hertz (both inclusive).
If Chef's commands have a frequency of X Hertz, find whether binary can hear them or not.*/
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
		    if(x>=67 && x<=45000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
