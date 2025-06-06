/*When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:

PDF-highighting.png

There is a list of  character heights aligned by index to their letters. For example, 'a' is at index  and 'z' is at index . There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

Example
 

The heights are  and . The tallest letter is  high and there are  letters. The hightlighted area will be  so the answer is .

Function Description

Complete the designerPdfViewer function in the editor below.

designerPdfViewer has the following parameter(s):

int h[26]: the heights of each letter
string word: a string
Returns

int: the size of the highlighted area*/ 

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int [] ht = new int[26];
        
        for(int i=0;i<26;i++){
            ht[i] = m.nextInt();
        }
        m.nextLine();
        
        String word = m.nextLine();
        char [] ch = word.toCharArray();
        int l = 0;
        for(int i=0;i<ch.length;i++){
               int index = ch[i]-97;
                l = Math.max(l,ht[index]);
        }
        System.out.println(l*word.length());
        m.close();
    }
}
