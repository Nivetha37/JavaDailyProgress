/*You are given a 0-indexed array nums of length n containing distinct positive integers. 
Return the minimum number of right shifts required to sort nums and -1 if this is not possible.
A right shift is defined as shifting the element at index i to index (i + 1) % n, for all indices.*/
class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n  = nums.size();
        int breakpoint = -1;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)>nums.get(i+1)) {
                if(breakpoint != -1) return -1;
                breakpoint = i+1;
            }
        }

        if(breakpoint == -1) return 0;

        for(int i=1;i<n;i++){
            if(nums.get((breakpoint+i)%n) <nums.get((breakpoint+i-1)%n)) return -1;
        }

        return n-breakpoint;
    }
}
