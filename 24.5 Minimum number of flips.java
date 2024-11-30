/*Chef has an array A of length N consisting of 1 and −1 only.
In one operation, Chef can choose any index i (1≤i≤N) and multiply the element Ai by −1.
Find the minimum number of operations required to make the sum of the array equal to 0. 
Output -1 if the sum of the array cannot be made 0.*/
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
		    int arr[] = new int[n];
		    int count=0;
		    for(int i=0;i<n;i++){
		        arr[i]=m.nextInt();
		        count+=arr[i];
		    }
		    System.out.println(n%2!=0?-1:Math.abs(count)/2);
		}

	}
}
