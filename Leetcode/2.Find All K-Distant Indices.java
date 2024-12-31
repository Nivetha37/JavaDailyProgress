/*You are given a 0-indexed integer array nums and two integers key and k.
A k-distant index is an index i of nums for which there exists at least one index j such that |i - j| <= k and nums[j] == key.
Return a list of all k-distant indices sorted in increasing order.*/



class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j=Math.max(0,i-k);j<=Math.min(n-1,i+k);j++){
                    s.add(j);
                }
            }
        }
        List<Integer> ls = new ArrayList<>(s);
        Collections.sort(ls);
        return ls;
    }
}