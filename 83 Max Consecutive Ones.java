/*Given a binary array nums, return the maximum number of consecutive 1's in the array.*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //if(nums.length == 1) return nums[0];
        int max = 0,count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            max = Math.max(max,count);
            count =0;
        }
        else count++;
      }
      return Math.max(max,count);  
    }
}
