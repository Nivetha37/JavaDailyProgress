/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.*/
class Solution {
    public static int[] rotate(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=n;
        rotate(nums,0,n-1);
        rotate(nums,0,k-1);
        rotate(nums,k,n-1);
 
