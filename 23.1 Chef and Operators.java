/*Chef has just started Programming, he is in first year of Engineering. 
Chef is reading about Relational Operators.
Relational Operators are operators which check relationship between two values.
Given two numerical values A and B you need to help chef in finding the relationship between them that is,First one is greater than second or, First one is less than second or, First and second one are equal.*/

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
		    System.out.println(a>b?">":a<b?"<":"=");
		}
	}
}

 