/*Chef considers the climate HOT if the temperature is above 20, otherwise he considers it COLD. 
You are given the temperature C, find whether the climate is HOT or COLD.*/
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
		    int c = m.nextInt();
		    if(c>20) System.out.println("HOT");
		    else System.out.println("COLD");
		}

	}
}
