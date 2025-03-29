/*Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.*/
class Solution {
    public int longestValidParentheses(String s) {
        List<Character> ls = new ArrayList<>();
        int count =0,top=-1;
        for(char c : s.toCharArray()){
            if(c=='('){
                top++;
                ls.add(c);
            }
            if(top!=-1 && ch==')' && ls.get(top)=='(') {
                top--;
                count+=2;
            }
            

            if(top==1) return count;
        }
        return count;
    }
}
