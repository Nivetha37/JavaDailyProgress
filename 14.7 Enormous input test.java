/*You are given N integers. Find the count of numbers divisible by K.*/

import java.util.*;
class CodeChef{
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int k = m.nextInt();
        int count = 0;
        
        for(int i=0;i<n;i++){
            int a = m.nextInt();
            if(a%k == 0) count++;
        }
        System.out.println(count);
    }
}
