/*A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Example



The person can buy a , or a . Choose the latter as the more expensive option and return .

Function Description

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget
Returns

int: the maximum that can be spent, or  if it is not possible to buy both items*/

import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int key[] = new int[n];
        int usb[] = new int[m];
        
        for(int i=0;i<n;i++){
            key[i] = sc.nextInt();
        }
        
        for(int i=0;i<m;i++){
            usb[i] = sc.nextInt();
        }
        
        Arrays.sort(usb);
        
        int max =-1,sum = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              sum = key[i]+usb[j];
              if(sum > b) break;
              else{
                  max = Math.max(max,sum);
              }  
            }
        }
        
        System.out.println(max);
        
        
        
       
    }
}
