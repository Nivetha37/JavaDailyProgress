/*Chef is playing a variant of Blackjack, where 3 numbers are drawn and each number lies between 1 and 10 (with both 1 and 10 inclusive). 
  Chef wins the game when the sum of these 3 numbers is exactly 21.
  Given the first two numbers A and B, that have been drawn by Chef, what should be 3-rd number that should be drawn by the Chef in order to win the game?
  Note that it is possible that Chef cannot win the game, no matter what is the 3-rd number.
  In such cases, report −1 as the answer.*/
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
		    int a = m.nextInt();
		    int b = m.nextInt();
		    System.out.println(21-a-b <=10 && 21-a-b>=1?21-a-b:-1);
		}

	}
}
