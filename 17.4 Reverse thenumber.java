/* The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.*/
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
		    int rev = 0;
		    while(n>0){
		        int digits = n%10;
		        rev = rev*10+digits;
		        n/=10;
		    }
		    System.out.println(rev);
		}

	}
}
