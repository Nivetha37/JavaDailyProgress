import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int d1 = m.nextInt();
        int m1 = m.nextInt();
        int y1 = m.nextInt();
        
        int d2 = m.nextInt();
        int m2 = m.nextInt();
        int y2 = m.nextInt();
        
        if(y1>y2) System.out.println(10000);
        else if(y1==y2 && m1>m2)  System.out.println((m1-m2)*500);
        else if(y1==y2 && m1==m2 && d1>d2)  System.out.println((d1-d2)*15);
        else System.out.println(0);
        
    }
}
