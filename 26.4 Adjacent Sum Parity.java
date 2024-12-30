/*Chef has an array A of length N.
Chef forms a binary array B of length N using the parity of the sums of adjacent elements in A.
Formally, Bi=(Ai+Ai+1)%2 for 1≤i≤N−1   BN=(AN+A1)%2
Here x%y denotes the remainder obtained when x is divided by y.
Chef lost the array A and needs your help. 
Given array B, determine whether there exists any valid array A which could have formed B.*/
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
    		    int b[] = new int[n];
    		    int arr[] = new int[n];
    		    int c = 0;
    		    for(int i=0;i<n;i++){
    		        b[i] = m.nextInt();
    		        c^=b[i];
    		    }
    		    System.out.println(c==0?"Yes":"No");
    		    
    		}
    
    	}
    }
