/*We have two special characters:
The first character can be represented by one bit 0.
The second character can be represented by two bits (10 or 11).
Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.*/

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0,bit=0;

        while(i<bits.length){
            bit = bits[i];
            if(bits[i]==0) i++;
            else i+=2;

        }

        return bit==0;
    }
}
