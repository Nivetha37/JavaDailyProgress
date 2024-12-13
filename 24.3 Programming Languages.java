/*Read problem statements in Mandarin, Bengali, Russian, and Vietnamese as well.
Chef is a software developer, so he has to switch between different languages sometimes.
Each programming language has some features, which are represented by integers here.
Currently, Chef has to use a language with two given features A and B.
He has two options --- switching to a language with two features A1 and B1, or to a language with two features A2 and B2.
All four features of these two languages are pairwise distinct.
Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).*/
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
		    int a1 = m.nextInt();
		    int b1 = m.nextInt();
		    int a2 = m.nextInt();
		    int b2 = m.nextInt();
		    
		    System.out.println((a1==a &  b1==b)||(a1==b & b1==a)?1:(a2==a &  b2==b)||(a2==b & b2==a)?2:0);
		}
	}
}
