/*
Chef is fond of burgers and decided to make as many burgers as possible.
Chef has A patties and B buns. To make 1 burger, Chef needs 1 patty and 1 bun.
Find the maximum number of burgers that Chef can make.
*/

import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t=m.nextInt();
        while(t-->0){
            int a = m.nextInt();
            int b = m.nextInt();
            if(a<=b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
