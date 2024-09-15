/*For each bill you pay using CRED, you earn X CRED coins.
At CodeChef store, each bag is worth 100 CRED coins.
Chef pays Y number of bills using CRED. 
Find the maximum number of bags he can get from the CodeChef store.*/

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
		    int x= m.nextInt();
		    int y = m.nextInt();
		    System.out.println(y*x/100);    
		}
	}
}
