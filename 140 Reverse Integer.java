/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).*/

class Solution {
    public int reverse(int x) {
        int temp = x;
        int rem;
        int ans = 0;
        while(temp!=0){
            rem = temp % 10;
             if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            }
            ans = ans*10 + rem;
            temp/=10;
        }

        return ans;
    }
}
