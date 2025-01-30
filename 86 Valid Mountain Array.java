/*Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 */
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3 || arr[0] >arr[1]  || arr[arr.length-2] < arr[arr.length-1]) return false;
        int steep=1;
        for(int i=0;i<arr.length-1;i++){
            
            if( arr[i]==arr[i+1]) return false;
            else if(steep ==0 && arr[i]< arr[i+1]) return false;
            else if(arr[i]>arr[i+1] && steep == 1) steep = 0;
        }
        return steep==0;
    }
}
