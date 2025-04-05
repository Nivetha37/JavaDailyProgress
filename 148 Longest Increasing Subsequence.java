/*Given an integer array nums, return the length of the longest strictly increasing subsequence.*/

class Solution {

    static int ReplaceWith(List<Integer> ls,int ele){
        int first = 0;
        int last = ls.size()-1;

        while(first<last){
            int mid = (first+last)/2;
            if(ls.get(mid)==ele) return mid;
            else if(ls.get(mid)<ele) first = mid+1;
            else last = mid;
        }

        return first;
    }


    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        int count =1;
        int index  =0;
        
        for(int i=1;i<n;i++){
            if(nums[i]>ls.get(index)){
                ls.add(nums[i]);
                index++;
                count++;
            }
            else{
                int ind = ReplaceWith(ls,nums[i]);
                ls.set(ind,nums[i]); 
            }
        }

        return count;


    }
}
