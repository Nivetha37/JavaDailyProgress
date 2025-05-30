/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.*/

class Solution {
    public String reverseVowels(String s) {
        char[] ch= s.toCharArray();

        int i=0,j=ch.length-1;
        String res ="";

        while(i<j){
            int flag =0;
            if(ch[i]!='a' && ch[i]!='e' && ch[i]!='i'&& ch[i]!='o' && ch[i]!='u' &&
            ch[i]!='A' && ch[i]!='E' && ch[i]!='I'&& ch[i]!='O'&& ch[i]!='U'){
                flag ++;
                i++;
            }
            if(ch[j]!='a' &&  ch[j]!='e'&& ch[j]!='i'&& ch[j]!='o'&& ch[j]!='u'&&
            ch[j]!='A' && ch[j]!='E' && ch[j]!='I' && ch[j]!='O' && ch[j]!='U'){
                flag++;
                j--;
            }
            if(flag==0){
                char temp = ch[i];
                ch[i]=ch[j];
                ch[j] = temp;
                
                i++;
                j--;
            }
        }

        for(char c : ch){
            res+=c;
        }
        return res;
    }
}
