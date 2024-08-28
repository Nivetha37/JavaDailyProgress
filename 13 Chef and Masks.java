/*Chef is shopping for masks. In the shop, he encounters 2 types of masks:
      Disposable Masks — cost X but last only 1 day.
      Cloth Masks — cost Y but last 10 days.
Chef wants to buy masks to last him 100 days. 
He will buy the masks which cost him the least. 
In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. 
Which type of mask will Chef choose?*/
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
		    double x = m.nextDouble();
		    double y = m.nextDouble();
		    if(x*100 < y*10) System.out.println("Disposable");
		    else System.out.println("Cloth");
		}
	}
}
