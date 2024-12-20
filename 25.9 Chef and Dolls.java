/*Chef is fan of pairs and he likes all things that come in pairs.
  He even has a doll collection in which the dolls come in pairs.
  One day while going through his collection he found that there are odd number of dolls.
  Someone had stolen a doll!!!

Help chef find which type of doll is missing..*/
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
		    int res =0;
		    for(int i=0;i<n;i++){
		        arr[i] = m.nextInt();
		        res^=arr[i];
		    }
		    System.out.println(res);
		}

	}
}
