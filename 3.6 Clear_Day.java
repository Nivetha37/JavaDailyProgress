/*
Chef classifies a day to be either rainy, cloudy, or clear.
In a particular week, Chef finds X days to be rainy and Y days to be cloudy.
Find the number of clear days in the week.
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
		int x = m.nextInt();
		int y = m.nextInt();
		
		System.out.println(7-(x+y));

	}
}
