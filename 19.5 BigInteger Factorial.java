/*You are asked to calculate factorials of some small positive integers.
Note: For larger numbers, their factorial can overflows any available numeric data type in C.*/

//METHOD 1: RECURSION

/*import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Codechef
{
    static BigInteger fact(BigInteger n){
        if(n==BigInteger.ZERO || n==BigInteger.ONE) return BigInteger.ONE;
        else return n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		
		
		int t = m.nextInt();
		m.nextLine();
		
		while(t-->0){
		    String s = m.nextLine();
		    BigInteger b = new BigInteger(s);
		    System.out.println(fact(b));
		}

	}
}*/

// METHOD 2: NON RECURSIVE
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
		
		
		int t = m.nextInt();
		
		while(t-->0){
		    int n = m.nextInt();
		    BigInteger fact = new BigInteger("1");
		    
		    for(int i=2;i<=n;i++){
		        fact= fact.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(fact);
		}

	}
}

