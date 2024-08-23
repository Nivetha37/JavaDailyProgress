/*Chef recently started selling a special fruit.
He has been selling the fruit for X rupees (X is a multiple of 100). 
He earns a profit of Y rupees on selling the fruit currently.
Chef decided to increase the selling price by 10%.
Please help him calculate his new profit after the increase in selling price.
Note that only the selling price has been increased and the buying price is same.*/
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
      //new pofit = old_profit + profit_for_increased_selling_price
      //ie.,y+(x*10/100)
		    System.out.println(y+(x/10));
		}

	}
}
