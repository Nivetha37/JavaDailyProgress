/*
In Chefland, everyone who earns strictly more than Y rupees per year, has to pay a tax to Chef. 
Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.
You have earned 𝑋(X>Y) rupees this year.
Find the minimum amount of money you have to invest so that you don't have to pay taxes this year.
  */
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
		    //given x is greater than y 
		    System.out.println(x-y);
		}

	}
}
