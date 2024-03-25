//to determine the min number of steps to make the smallest value of array into the largest value


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Your code goes here
            int count =0;
            int x=a[0];
            for(int i=0;i<n;i++){
                if(x>a[i]){
                    x=a[i];
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]!=x){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
