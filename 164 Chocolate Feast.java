/*Little Bobby loves chocolate. He frequently goes to his favorite  store, Penny Auntie, to buy them. They are having a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.

Example



He has  to spend, bars cost , and he can turn in  wrappers to receive another bar. Initially, he buys  bars and has  wrappers after eating them. He turns in  of them, leaving him with , for  more bars. After eating those two, he has  wrappers, turns in  leaving him with  wrapper and his new bar. Once he eats that one, he has  wrappers and turns them in for another bar. After eating that one, he only has  wrapper, and his feast ends. Overall, he has eaten  bars.

Function Description

Complete the chocolateFeast function in the editor below.

chocolateFeast has the following parameter(s):

int n: Bobby's initial amount of money
int c: the cost of a chocolate bar
int m: the number of wrappers he can turn in for a free bar
Returns

int: the number of chocolates Bobby can eat after taking full advantage of the promotion
Note: Little Bobby will always turn in his wrappers if he has enough to get a free chocolate.*/

import java.util.*;
public class Solution{
    static int Choco_Count(int cho,int m){
            
            int new_cho= cho/m;
            int cvr = cho%m;
            cho = cvr+new_cho;
            
            return cho<m?new_cho:new_cho+Choco_Count(cho,m);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int cho = n/c;
            System.out.println(cho+Choco_Count(cho,m));
            
            
             
        }
    }
}

