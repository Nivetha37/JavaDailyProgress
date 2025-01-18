/*Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr*/
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        List<List<Integer>>  ls = new ArrayList<>();

        

        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1] -arr[i];
            if(diff==min) ls.add(Arrays.asList(arr[i],arr[i+1]));
            else if(diff < min){
                min = diff;
                ls.clear();
                ls.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return ls;
    }
}
