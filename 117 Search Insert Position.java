/*Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.*/
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]) return nums.length;
        if(target < nums[0]) return 0;
        int first = 0;
        int last = nums.length-1;
        int mid=0;

        while(first<last){
            mid = (first+last)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) last = mid-1;
            else first = mid+1;
        }

        return nums[first]<target?first+1:first;
        
    }
}
