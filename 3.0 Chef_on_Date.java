/*
Chef and his girlfriend go on a date. 
Chef took X dollars with him, and was quite sure that this would be enough to pay the bill.
At the end, the waiter brought a bill of Y dollars.
Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.
  */
import java.util.*;
class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while(t-->0){
            int x = m.nextInt();
            int y = m.nextInt();
            
            if(x>=y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
