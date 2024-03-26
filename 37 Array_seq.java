/*  - array a denotes alice running distance
    - array b denotes bob running distance
    - Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
    - Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.
    - task is to determine how many days they both were happy
  */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int count=0;
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(a[i]<=2*b[i] && b[i]<=2*a[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
        
        
    }
}
