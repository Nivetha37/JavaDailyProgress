/*Write a program to print the grades of 3 students based on the marks they have obtained provided as input. 
The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.

[Note: You need to take inputs for all 3 students.]*/
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int arr[] = new int[3];
		for(int i=0;i<3;i++){
		    arr[i] = m.nextInt();
		    if(arr[i]>90) System.out.println("A");
		    else if(arr[i]>70) System.out.println("B");
		    else if(arr[i]>= 40) System.out.println("C");
		    else System.out.println("F");
		}
	}
}
