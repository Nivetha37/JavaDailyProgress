/*Alice and Bob are playing a game.
Each player rolls a regular six faced dice 3 times.
The score of a player is the sum of the values of the highest 2 rolls. 
The player with the highest score wins, and the game ends in a Tie if both players have the same score.
Find the winner of the game or determine whether it is a tie.*/


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
		    int a1 = m.nextInt();
		    int a2 = m.nextInt();
		    int a3 = m.nextInt();
		    int b1 = m.nextInt();
		    int b2 = m.nextInt();
		    int b3 = m.nextInt();
		    int a = Math.min(a1,Math.min(a2,a3));
		    int b = Math.min(b1,Math.min(b2,b3));
		    int sum1 = a1+a2+a3-a;
		    int sum2 = b1+b2+b3-b;
		    System.out.println(sum1>sum2?"Alice":sum1<sum2?"Bob":"Tie");
		}
	}
}





/*import java.util.*;
class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while (t--> 0) {
            int a[] = new int[3];
            int b[] = new int[3];
            int maxa = 0, max2a = 0, maxb = 0, max2b = 0;

            for (int i = 0; i < 3; i++) {
                a[i] = m.nextInt();
                if (a[i] > maxa) {
                    max2a = maxa;
                    maxa = a[i];
                    
                }

                else if (a[i] <= maxa && a[i] > max2a) max2a = a[i];
            }
            
            for (int i = 0; i < 3; i++) {
                b[i] = m.nextInt();
                if (b[i] > maxb) {
                    max2b = maxb;
                    maxb = b[i];
                    
                }

                else if (b[i] <= maxb && b[i] > max2b) max2b = b[i];
            }
            
            System.out.println(maxa+max2a > (maxb+max2b)?"Alice":maxa+max2a < (maxb+max2b)?"Bob":"Tie");
        }
    }
}*/

