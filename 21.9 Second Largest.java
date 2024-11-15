/*Three numbers A, B and C are the inputs. Write a program to find second largest among them.*/
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
		    int c = m.nextInt();
		    
		    if(a>b && b>c || a<b && b<c) System.out.println(b);
		    else if(a>c && c>b || a<c && c<b) System.out.println(c);
		    else System.out.println(a);
		}

	}
}
