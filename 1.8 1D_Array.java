/*Task

The code in your editor does the following:

Reads an integer from stdin and saves it to a variable n , denoting some number of integers.
Reads  integers corresponding to  from stdin and saves each integer to a variable, .
Attempts to print each element of an array of integers named.
*/ 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i =0 ;i<n; i++){
            a[i] = scan.nextInt();   
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
