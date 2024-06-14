/*Ashu and Arvind participated in a coding contest, as a result of which they received N chocolates. 
Now they want to divide the chocolates between them equally.
You cannot break a chocolate in two or more pieces.
Output YES if they can divide chocolates between them equally,else output NO.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int n = m.nextInt();
		    if(n%2==0) System.out.println("YES");
		    else System.out.println("NO");
		}

	}
}
