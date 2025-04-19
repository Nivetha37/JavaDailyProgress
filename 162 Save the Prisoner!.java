/*A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially around the table until all have been distributed.

The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. Determine the chair number occupied by the prisoner who will receive that candy.

Example
There are  prisoners,  pieces of candy and distribution starts at chair . The prisoners arrange themselves in seats numbered  to . Prisoners receive candy at positions . The prisoner to be warned sits in chair number .
*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long s = sc.nextLong();
            
            System.out.println((m+s-1)%n==0?n:(m+s-1)%n);
        }
    }
}
