/*
Election season has started in Chefland and the election commission wants to know the count of eligible voters.
There are N people in Chefland where the age of the i th person in A(i).
Given that a person needs to be at least X years old to vote, find the number of eligible voters.
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
		    int n = m.nextInt();
		    int x = m.nextInt();
		    int arr[] = new int[n];
		    int count = 0;
		    for(int i=0;i<n;i++){
		        arr[i] = m.nextInt();
		        if(arr[i] >= x ) count++;
		    }
		    System.out.println(count);
		}

	}
}
