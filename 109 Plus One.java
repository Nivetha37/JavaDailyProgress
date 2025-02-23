/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
 */

class Solution {
    public int[] plusOne(int[] digits) {

        int carry =1,n=digits.length;

        for(int i=n-1;i>-1;i--){
            int sum = digits[i]+carry;
            digits[i] = sum%10;
            carry=sum/10;
            if(carry==0) break;
        }

        if(carry==0) return digits;

        int arr[] = new int[n+1];
        arr[0] = carry;

        for(int i=0;i<n;i++){
            arr[i+1] = digits[i];
        }

        return arr;

        
    }
}
