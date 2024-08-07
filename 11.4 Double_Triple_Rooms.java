/*Six friends go on a trip and are looking for accommodation. 
  After looking for hours, they find a hotel which offers two types of rooms — double rooms and triple rooms.
  A double room costs Rs. X, while a triple room costs Rs. Y.*/
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
		    int x = m.nextInt();
		    int y = m.nextInt();
		    if(3*x <= 2*y) System.out.println(3*x);
		    else System.out.println(2*y);
		}

	}
}
