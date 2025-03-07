/*You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if(matrix[0][0] > target || matrix[m-1][n-1] < target) return false;

        int targetrow =0;
        for(int i=0;i<m;i++){
            if(matrix[i][n-1] == target) return true;
            if(matrix[i][n-1] > target){
               targetrow = i; 
               break;
            }
        }

        for(int i=0;i<n;i++){
            if(matrix[targetrow][i]==target) return true;
        }
        return false;
        
    }
}
