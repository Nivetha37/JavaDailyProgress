/*A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.*/

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        

        int i=n/2;
        int j=i+1;
        while(i>0 || j<n-1){
            if(i>=0 &&  (nums[i]>nums[i-1]||i==0) && (i==n-1 || nums[i]>nums[i+1])) return i;
            else if(j<n && nums[j]>nums[j-1] && (j==n-1 || nums[j]>nums[j+1])) return j;
            i--;
            j++;
        }
        return 0;
        
    }
}
