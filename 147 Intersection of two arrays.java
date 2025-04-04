/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int max =0;
        for(int i:nums1){
            if(max <i) max = i;
        }

        boolean[] freq = new boolean[max+1];
        int[] tem = new int[max+1];

        for(int i:nums1){
            freq[i]=true;
        }

        int index=0;
        for(int i:nums2){
            if(i<=max && freq[i]){
                tem[index++] = i;
                freq[i] =false;
            }
        }

        int[] res = new int[index];
        for(int i=0;i<index;i++){
            res[i] = tem[i];
        }

        return res;

    }
}
