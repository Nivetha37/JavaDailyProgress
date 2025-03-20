/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
class Solution {
    public int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 1;
        int sum=1;
        for(int i=2;i<n+1;i++){
            sum=prev1+prev2;
            prev2=prev1;
            prev1=sum;
        }
        return sum;  
    }
}
