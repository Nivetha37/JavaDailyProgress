/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> ls = new HashMap<>();
       int []arr = {-1,-1};

       for(int i=0;i<nums.length;i++){
        int res = target-nums[i];
        if(ls.containsKey(res)) {
            arr[0] = ls.get(res);
            arr[1] = i;
            break;
        }
        else{
            ls.put(nums[i],i);
        }
       }

       return arr;
    }
}
