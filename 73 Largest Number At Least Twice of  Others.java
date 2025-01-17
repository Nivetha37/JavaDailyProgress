/*You are given an integer array nums where the largest integer is unique.
Determine whether the largest element in the array is at least twice as much as every other number in the array.
If it is, return the index of the largest element, or return -1 otherwise.*/
class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length,max_index=0;
        
        for(int i=0;i<n;i++){
            if(nums[max_index]<nums[i]) max_index = i;
        }

        for(int i=0;i<n;i++){
            if(i!=max_index && 2*nums[i]>nums[max_index]) return -1;
        }

        return max_index;
    
    }
}
