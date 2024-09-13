/*Kattapa, as you all know was one of the greatest warriors of his time. 
  The kingdom of Maahishmati had never lost a battle under him (as army-chief), and the reason for that was their really powerful army, also called as Mahasena.
  Kattapa was known to be a very superstitious person.
  He believed that a soldier is "lucky" if the soldier is holding an even number of weapons, and "unlucky" otherwise.
  He considered the army as "READY FOR BATTLE" if the count of "lucky" soldiers is strictly greater than the count of "unlucky" soldiers, and "NOT READY" otherwise.

Given the number of weapons each soldier is holding, your task is to determine whether the army formed by all these soldiers is "READY FOR BATTLE" or "NOT READY".*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int[] arr = new int[n];
		int odd=0,even=0;
		for(int i=0;i<n;i++){
		    arr[i] = m.nextInt();
		    if(arr[i]%2 == 0) even++;
		    else odd++;
		}
		if(odd < even) System.out.println("READY FOR BATTLE");
		else System.out.println("NOT READY");
	}
}
