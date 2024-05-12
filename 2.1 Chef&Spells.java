/*Chef has three spells.
Their powers are A, B, and C respectively.
Initially, Chef has 0 hit points, and if he uses a spell with power P, then his number of hit points increases by P.
Before going to sleep, Chef wants to use exactly two spells out of these three. 
Find the maximum number of hit points Chef can have after using the spells.*/

import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t=m.nextInt();
        
        while(t-- >0){
            int A = m.nextInt();
            int B = m.nextInt();
            int C = m.nextInt();
            
            int[] a = {A,B,C};
            
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            for(int i=0;i<3;i++){
                if(a[i]>max){
                    max2 = max;
                    max = a[i];
                }
                else if(a[i] >max2){
                    max2 = a[i];
                }
            }
            
            System.out.println(max+max2);
        }
    }
}
