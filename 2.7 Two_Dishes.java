/*
Chef will have N guests in his house today.
He wants to serve at least one dish to each of the N guests.
Chef can make two types of dishes.
He needs one fruit and one vegetable to make the first type of dish and one vegetable and one fish to make the second type of dish. 
Now Chef has A fruits, B vegetables, and C fishes in his house. 
Can he prepare at least N dishes in total?
  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner m = new Scanner(System.in); 
		int t = m.nextInt();
		while(t-->0){
		    int n = m.nextInt();
		    int a = m.nextInt();
		    int b = m.nextInt();
		    int c = m.nextInt();
		    if(b >= n && a+c >=n){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
