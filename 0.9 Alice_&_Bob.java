/*
Alice has scored X marks in her test and Bob has scored Y marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score. 
Determine whether she is happy or not.
*/
import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int x=m.nextInt();
        int y=m.nextInt();
        if(x  >= y*2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } 
}
