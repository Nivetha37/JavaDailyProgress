/*Given two strings, determine if they share a common substring. A substring may be as small as one character.

  Function Description

Complete the function twoStrings in the editor below.

twoStrings has the following parameter(s):

string s1: a string
string s2: another string
Returns

string: either YES or NO*/

public static String twoStrings(String s1, String s2) {
    // Write your code here
    Set<Character> s = new HashSet<>();
    
    for(char c:s1.toCharArray()){
        s.add(c);
    }
    
    for(char c:s2.toCharArray()){
        if(s.contains(c)) return "YES";
    }
    
    return "NO";

}
