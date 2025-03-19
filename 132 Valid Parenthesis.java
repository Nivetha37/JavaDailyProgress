/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.*/
class Solution {
    public boolean isValid(String s) {
        int top =-1;
        char arr[] = new char[s.length()];
        for(char ch : s.toCharArray()){
            if(ch=='('){
                top++;
                arr[top] = ')';
            }
            else if(ch=='['){
                top++;
                arr[top] = ']';
            }
            else if(ch=='{'){
                top++;
                arr[top] = '}';
            }
            else if(top==-1||arr[top]!=ch) return false;
            else top--;
        }
        return top==-1;
    }
}
