/*Abhi is a salesman.
He was given two types of candies, which he is selling in N different cities.
For the prices of the candies to be valid, Abhi's boss laid down the following condition:
A given type of candy must have distinct prices in all N cities.
In his excitement, Abhi wrote down the prices of both the candies on the same page and in random order instead of writing them on different pages.
Now he is asking for your help to find out if the prices he wrote are valid or not.
You are given an array A of size 2N.
Find out whether it is possible to split A into two arrays, each of length N, such that both arrays consist of distinct elements.
Both arrays can have distinct elements only if no element in the original array is repeated more than twice.*/
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
            int n = m.nextInt();
            int arr[] = new int[2 * n];
            boolean b[] = new boolean[2 * n];

            for (int i = 0; i < 2 * n; i++) {
                arr[i] = m.nextInt();
            }
            
            int flag =1;
            for (int i = 0; i < 2*n - 1; i++) {
                if (b[i] == false) {
                    int count =0;
                    for (int j = i + 1; j < 2*n; j++) {
                        if(b[j]==false && arr[i]==arr[j]){
                            if(count==0){
                                count++;
                                b[j] = false;
                            }
                            else {
                                flag =0;
                                break;
                            }
                        }
                    }
                }
            }
            
            
            System.out.println(flag==1?"Yes":"No");

        }

    }
}
