/*Write a program to find the factorial value of any number entered by the user.*/
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
		    int temp =n;
		    int fact = n;
		    while(temp-->1){
		        fact*=temp;
		    }
		    System.out.println((n==0 || n==1)?1:fact);
		}
	}
}
