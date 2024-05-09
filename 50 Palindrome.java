//Given a string A, print Yes if it is a palindrome, print No otherwise.
  
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        StringBuilder s = new StringBuilder(A);
        s.reverse();
        
        String rev = s.toString();
        
        if(A.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
