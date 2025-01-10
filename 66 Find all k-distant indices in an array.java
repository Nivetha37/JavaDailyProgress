/*You are given a 0-indexed integer array nums and two integers key and k. 
A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
Return a list of all k-distant indices sorted in increasing order.*/

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ls = new ArrayList<>();
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                ls.add(i);
                count++;
            }
        }
        List<Integer> res = new ArrayList<>();
        boolean b[] = new boolean[nums.length];
        int j = 0;
        while(count>0){
            int dig = ls.get(j);
            for(int i=0;i<nums.length;i++){
            if( b[i]==false &&Math.abs(dig-i)<=k){
                res.add(i);
                b[i] = true;
            }
         }
         j++;
         count--;
        }

        return res;

    }
}
