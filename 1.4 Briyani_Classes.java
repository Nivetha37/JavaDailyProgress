/*
According to a recent survey, Biryani is the most ordered food. 
Chef wants to learn how to make world-class Biryani from a MasterChef. 
Chef will be required to attend the MasterChef's classes for X weeks, and the cost of classes per week is Y coins.
What is the total amount of money that Chef will have to pay?
  */

import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while(t-- >0){
            int x = m.nextInt();
            int y = m.nextInt();
            System.out.println(x*y);
        }
    }
}
