/*Chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. 
  The monthly cost of the gym is X and personal training will cost him an additional Y per month.
  Chef's total budget per month is only Z. 
         -Print 1 if Chef can only join the gym.
         -Print 2 if he can also have a personal trainer.
         -Print 0 if he can't even join the gym.

Note that if Chef wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without joining the gym.*/
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
		    int z = m.nextInt();
		    if(x<=z){
		        if(x+y <= z) System.out.println(2);
		        else System.out.println(1);
		    }
		    else System.out.println(0);
		}

	}
}
