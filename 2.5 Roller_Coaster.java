/*
Chef's son wants to go on a roller coaster ride. 
 The height of Chef's son is X inches while the minimum height required to go on the ride is H inches.
Determine whether he can go on the ride or not.
  */
  
import java.util.*;
class CodeChef{
    public static void main(String[] args){
       Scanner m = new Scanner (System.in);
       int t = m.nextInt();
       while(t-->0){
           int x = m.nextInt();
           int h = m.nextInt();
           
           if(x>=h){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
       }
    }
} 
