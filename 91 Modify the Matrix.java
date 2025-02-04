/*Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix called answer. 
Make answer equal to matrix, then replace each element with the value -1 with the maximum element in its respective column.
Return the matrix answer.*/

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1) matrix[i][j] = getMax(matrix,j);
            }
        }

        return matrix;
    }

    public static int getMax(int[][] arr,int col){
        int max = -1;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i][col]);
        }

        return max;
    }
}
