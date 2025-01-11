/*The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.*/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList<>();
        int i = num.length-1;
        int carry =0;

        while(i>=0 || carry>0 || k>0){
            int dig = (i>=0?num[i]:0)+(k%10)+carry;
            ls.add(dig%10);
            i--;
            k/=10;
            carry=dig/10;
        }

        Collections.reverse(ls);

        return ls;
    }
}
