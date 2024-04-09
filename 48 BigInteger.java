/*
Given a large number N. You need to print the number N+1.
The number is very large and it will not fit in standard integer data type.
You have to take the input as String and then manipulate the digits to convert it to N+1.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t=m.nextInt();
		m.nextLine();
		
		while(t-- >0){
		    String S=m.nextLine();
		    BigInteger big= new BigInteger(S);
		    BigInteger N = big.add(BigInteger.ONE);
		    System.out.println(N);
		    }

	}
}
