/*You are given an integer array nums.
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.*/
class Solution {

    public static int sumofdig(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
    int min= Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
        int res = sumofdig(nums[i]);
        min = Math.min(min,res);    
    }
    return min;
        
    }
}
