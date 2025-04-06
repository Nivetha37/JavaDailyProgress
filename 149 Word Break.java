/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.*/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(String i:wordDict){
            max = Math.max(max,i.length());
            min = Math.min(min,i.length());
        }

        int n  = s.length();
        boolean dp[] = new boolean[n+1];
        dp[0]=true;

        for(int i=min;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-max);j--){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }

        return dp[n];
    }
}
