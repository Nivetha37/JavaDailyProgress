/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.*/
class Solution {

    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> s = new HashMap<>();
        for(int i:nums){
            s.put(i,false);
        }

        int long_seq =0;
        
        for(Integer i : s.keySet()){
            int count =1;
            s.put(i,true);
            int num =i+1;
            while(s.containsKey(num) && !s.get(num)){
                s.put(num,true);
                count++;
                num++;
            }

            num =i-1;
            while(s.containsKey(num) && !s.get(num)){
                s.put(num,true);
                count++;
                num--;
            }

            long_seq = Math.max(long_seq,count);
        }


        return long_seq;
    }
}
