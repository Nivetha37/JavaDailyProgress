/*There is a group of N friends who wish to enroll in a course together. 
The course has a maximum capacity of M students that can register for it.
If there are K other students who have already enrolled in the course, 
determine if it will still be possible for all the N friends to do so or not.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    if(n+k<=m) System.out.println("Yes");
		    else System.out.println("No");
		}

	}
}
