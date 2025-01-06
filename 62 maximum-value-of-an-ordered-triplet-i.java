/*You are given a 0-indexed integer array nums.
Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. 
If all such triplets have a negative value, return 0.
The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].*/
import java.util.*;
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max_val = 0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    long val = (long) (nums[i]-nums[j])*nums[k];
                    max_val = Math.max(val,max_val);
                }
            }
        }

        return max_val;
    }
}
