import java.util.*;
import java.lang.*;
import java.io.*;

//finding maximum elements in a sequence of elements
//sequence of numbers are representing the mountain height

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();

        while (t-- > 0) {
            int n = m.nextInt();
            int max_height = 0;
            for (int j = 0; j < n; j++) {
                int num = m.nextInt();
                if (num > max_height) {
                    max_height = num;
                }
            }

            System.out.println(max_height);
        }

    }
}
