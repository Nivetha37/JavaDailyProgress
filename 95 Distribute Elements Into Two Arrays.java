/*You are given a 1-indexed array of distinct integers nums of length n.

You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:

If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].

Return the array result.

 */
class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        int max1 = nums[0],max2=nums[1];
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(max1 > max2) {
                ls1.add(nums[i]);
                max1 = nums[i];
            }
            else {
                ls2.add(nums[i]);
                max2 = nums[i];
            } 
        }

        
        int [] arr = new int[ls1.size()+ls2.size()];
        for(int i=0;i<ls1.size();i++){
            arr[i] = ls1.get(i);
        }

        int index =ls1.size();
        for(int i=0;i<ls2.size();i++){
            arr[index++] = ls2.get(i);
        }
        return arr;
    }
}
