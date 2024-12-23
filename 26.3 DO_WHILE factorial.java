/*Write a program that uses a do-while loop to find the factorial of a given input number.*/
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int n = m.nextInt();
		int fact =1,i=1;
		do{
		   fact*=i;
		   i++;
		}while(i<=n);
		System.out.println(fact);

	}
}
