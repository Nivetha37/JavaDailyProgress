/*There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
For each location indices[i], do both of the following:
Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.*/

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        

        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new HashSet<>();

        for(int i=0;i<indices.length;i++){
            s.add(indices[i][0]);
            t.add(indices[i][1]);
        }

        

        if(s.size()==m && t.size()==n) return 0;
        return 
        
    }
}
