/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.*/
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       Set<Integer> s = new HashSet<>();

       for(int i:arr){
        mp.put(i,mp.getOrDefault(i,0)+1);
       }

       for(int i:mp.values()){
        if(!s.add(i)) return false;
       } 

       return true;
    }
}
