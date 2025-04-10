/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }

        List<List<Integer>> ls = new ArrayList<>(s);
        return ls;


    }
}
