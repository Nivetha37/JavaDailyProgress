/*On the occasion of World Blood Donor Day, Chef has organized an event to reward regular blood donars in Chefland.
If the donor has made less than or equal to 3 donations, they receive a BRONZE donor badge.
If the donor has made more than 3 but less than equal to 6 donations, they receive a SILVER donor badge.
If the donor has made more than 6 donations, they receive a GOLD donor badge.
Given that a person has made X donations, find the badge they receive.*/
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
		    if(x<=3) System.out.println("BRONZE");
		    else if(x>3 & x<=6) System.out.println("SILVER");
		    else System.out.println("GOLD");
		    
		}

	}
}
