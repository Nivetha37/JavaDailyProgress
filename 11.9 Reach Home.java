/*Chef is hungry and wants to reach home.
Chef can travel up to 5 kilometres on 1 litre of fuel on his motorcycle.
Currently, his motorcycle is filled with X litres of fuel and his home is Y kilometres away.*/
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
		    if(x*5 >= y) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
