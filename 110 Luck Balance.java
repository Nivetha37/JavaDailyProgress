/*Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests. Initially, her luck balance is 0. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers,  and :

 is the amount of luck associated with a contest. If Lena wins the contest, her luck balance will decrease by ; if she loses it, her luck balance will increase by .
 denotes the contest's importance rating. It's equal to  if the contest is important, and it's equal to  if it's unimportant.
If Lena loses no more than  important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.*/

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l[] = new int[n];
        int t[] = new int[n];
        List<Integer> ls = new ArrayList<>();
        
        int sum =0;
        
        for(int i=0;i<n;i++){
            l[i] = sc.nextInt();
            t[i] = sc.nextInt();
            if(t[i]==0) sum+=l[i];
            else ls.add(l[i]);
        }
        
        Collections.sort(ls,Collections.reverseOrder());
        
        for(int i=0;i<ls.size();i++){
            if(i<k) sum+= ls.get(i);
            else sum-= ls.get(i);
        }
        
        System.out.println(sum);
        
        
    }
}
