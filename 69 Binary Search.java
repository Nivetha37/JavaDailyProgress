/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int first = 0,last= n-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] <target) first = mid +1;
            else last = mid -1;
        }
        return -1;
    }
}
