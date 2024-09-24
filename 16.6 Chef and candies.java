/*There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. 
  To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.
  Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children.*/
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
		    int x = m.nextInt();
		    
		    System.out.println(n>x?(n-x+3)/4:0);
		    
		    /*if(n > x){
		        System.out.println((n-x)%4 ==0?(n-x)/4:(n-x)/4+1);
		    }
		    else System.out.println(0);*/
		}

	}
}
