/* 
Chef defines a pair of positive integers (a,b) to be a Oneful Pair, if (a+b+(a.b)) == 111. 
Given two positive integers a and b, output Yes if they are a Oneful Pair. And No otherwise.
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a+b+(a*b) == 111){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
	}
}
