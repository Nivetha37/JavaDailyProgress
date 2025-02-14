/*A triplet is an array of three integers. You are given a 2D integer array triplets, where triplets[i] = [ai, bi, ci] describes the ith triplet. You are also given an integer array target = [x, y, z] that describes the triplet you want to obtain.

To obtain target, you may apply the following operation on triplets any number of times (possibly zero):

Choose two indices (0-indexed) i and j (i != j) and update triplets[j] to become [max(ai, aj), max(bi, bj), max(ci, cj)].
For example, if triplets[i] = [2, 5, 3] and triplets[j] = [1, 7, 5], triplets[j] will be updated to [max(2, 1), max(5, 7), max(3, 5)] = [2, 7, 5].
Return true if it is possible to obtain the target triplet [x, y, z] as an element of triplets, or false otherwise.*/
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        boolean v1=false,v2=false,v3=false;

        for(int[] t : triplets){
            if(t[0] <= target[0] && t[1]<=target[1] && t[2]<=target[2]){
                if(t[0]==target[0]) v1 = true;
                if(t[1]==target[1]) v2 = true;
                if(t[2] == target[2])  v3 = true;
            }
        }

        return v1 && v2 && v3;
        
    }
}
