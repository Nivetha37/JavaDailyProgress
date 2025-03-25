/*You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.*/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int max1 = nums[0];
        int max2 = nums[1];
        if(max2<max1) max2 = max1;

        for(int i=2;i<n;i++){
            int temp = max2;
            if(nums[i]+max1 >max2){
                max2 = nums[i]+max1;
            }
            max1 = temp;
        }

        return max2;
    }
}
