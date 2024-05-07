/*
Alice and Bob were having an argument about which of them is taller than the other. 
Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is X centimeters and Bob's height is Y centimeters. 
Help Charlie decide who is taller.

It is guaranteed that 𝑋≠𝑌.
*/
import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        
        while(t-- >0){
            int x = m.nextInt();
            int y = m.nextInt();
            if(x>y){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
