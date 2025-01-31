/*You are given a 0-indexed array nums of integers.

A triplet of indices (i, j, k) is a mountain if:

i < j < k
nums[i] < nums[j] and nums[k] < nums[j]
Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.*/

class Solution {
    public int minimumSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[nums.length-1] = nums[nums.length-1];

       for(int i=nums.length-2;i>=0;i--){
        arr[i] = Math.min(nums[i],nums[i+1]);
       }

       int prev = nums[0],res = Integer.MAX_VALUE;

       for(int i=1;i<nums.length-1;i++){
        if(nums[i] > prev && nums[i] > arr[i+1]){
            res = Math.min(res,(prev+nums[i]+arr[i+1]));
        }
        prev = Math.min(nums[i],prev);
       }
       return res==Integer.MAX_VALUE?-1:res; 
    }
}
