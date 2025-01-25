/*Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.*/
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        int a = nums[nums.length-1],b = nums[0];

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        return a;
    }
}
