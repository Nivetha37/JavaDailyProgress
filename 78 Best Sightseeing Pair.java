/*You are given an integer array values where values[i] represents the value of the ith sightseeing spot. 
Two sightseeing spots i and j have a distance j - i between them.
The score of a pair (i < j) of sightseeing spots is 
             values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.
Return the maximum score of a pair of sightseeing spots.*/
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int maxscore = values[n-2]+n-2+values[n-1]-n-1;
        int maxvalue = Math.max((values[n-1]-n-1),(values[n-2]-n-2)); //+0

        for(int j=n;j<;j++){
            maxscore = Math.max(maxscore,maxvalue+values[j]-j);
            maxvalue = Math.max(maxvalue,values[j]+j);
        }

        return maxscore;
    }
}
