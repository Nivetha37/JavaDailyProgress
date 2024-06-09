/*Trick or treat, bags of sweets, ghosts are walking down the street
It's Halloween and Suri Bhai is out to get his treats.
  
There are two sectors in his neighborhood, "Bones" and "Blood". They have N and M people, respectively.
Each person in "Bones" will hand out X treats, and each person in "Blood" will hand out Y treats.
How many treats does Suri Bhai get from visiting everyone in his neighborhood in total?*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(n*x+m*y);

	}
}
