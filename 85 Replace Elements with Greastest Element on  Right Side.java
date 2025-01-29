/*Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.*/
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0,temp=arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i=arr.length-1;i>0;i--){
            max = Math.max(max,temp);
            temp = arr[i-1];
            arr[i-1] = max;
        }
        return arr;
    }
}
