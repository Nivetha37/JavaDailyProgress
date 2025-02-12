/*An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.*/
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            boolean [] row = new boolean[n];
            boolean [] col = new boolean[n];
            for(int j=0;j<n;j++){
                int rowval = matrix[i][j];
                int colval = matrix[j][i];

                

                if(row[rowval-1]) return false;
                row[rowval-1] = true;

                if(col[colval-1]) return false;
                col[colval-1] = true;
            }

        }

        return true;
    }
}
