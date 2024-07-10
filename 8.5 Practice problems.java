/*Most programmers will tell you that one of the ways to improve your performance in competitive programming is to practice a lot of problems.
Our Chef took the above advice very seriously and decided to set a target for himself.
Chef decides to solve at least 10 problems every week for 4 weeks.
Given the number of problems he actually solved in each week over 4 weeks as P1,P2,P3, and P4.
Output the number of weeks in which Chef met his target.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int  arr[] = new int[4];
		int count = 0;
		for(int i = 0;i<4;i++){
		    arr[i] = m.nextInt();
		    if(arr[i]>=10) count++;
		}
		System.out.println(count);
	}
}
