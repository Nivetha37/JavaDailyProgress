/*Chef received N candies on his birthday.
  He wants to put these candies in some bags. 
  A bag has K pockets and each pocket can hold at most M candies. 
  Find the minimum number of bags Chef needs so that he can put every candy into a bag.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n % (k * m) == 0 ? n / (k * m) : n / (k * m) + 1);
        }

    }
}
