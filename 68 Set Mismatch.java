/*You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        int freq[] = new int[n+1];
        int res[] = new int[2];
        for(int  i:nums){
            freq[i]++;
        }

        for(int i=1;i<=n;i++){
            if(freq[i]==2) res[0] = i;
            if(freq[i] == 0) res[1] = i;
        }
        return res;
    }
}
