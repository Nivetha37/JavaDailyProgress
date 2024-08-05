/* Chef rented a car for a day.
Usually, the cost of the car is Rs 10 per km.
However, since Chef has booked the car for the whole day, he needs to pay for at least 300 kms even if the car runs less than 300 kms.
If the car ran X kms, determine the cost Chef needs to pay.*/
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
		    if(x <= 300) System.out.println(300*10);
		    else System.out.println(x*10);
		}
	}
}
