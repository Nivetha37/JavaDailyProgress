/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]) && i-mp.get(nums[i]) <=k) return true;
            else mp.put(nums[i],i);
        }
        return false;
    }
}
