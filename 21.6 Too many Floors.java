/*Chef and Chefina are residing in a hotel.

There are 10 floors in the hotel and each floor consists of 10 rooms.

Floor 1 consists of room numbers 1 to 10.
Floor 2 consists of room numbers 11 to 20.
…
…
Floor i consists of room numbers 10⋅(i−1)+1 to 10⋅i.

You know that Chef's room number is X while Chefina's Room number is Y.
If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while (t--> 0) {
            int x = m.nextInt();
            int y = m.nextInt();
            System.out.println(Math.abs(((x - 1) / 10 + 1) - ((y - 1) / 10 + 1)));
        }
    }
}
