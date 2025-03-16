/*Given an m x n matrix, return all elements of the matrix in spiral order.*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int m=matrix.length;
       int n = matrix[0].length;
       List<Integer> ls = new ArrayList<Integer>();
       int i=0;
       int top=0,bottom=m-1,left=0,right=n-1;
       while(top<=bottom && left<=right){
        i=left;
        while(i<=right){
            ls.add(matrix[top][i]);
            i++;
        }
        top++;

        i = top;
        while(i<=bottom){
            ls.add(matrix[i][right]);
            i++;
        }
        right--;

        if(top<=bottom){
            i=right;
            while(i>=left){
                ls.add(matrix[bottom][i]);
                i--;
            }
            bottom--;
        }

        if(left<=right){
            i=bottom;
            while(i>=top){
                ls.add(matrix[i][left]);
                i--;
            }
            left++;
        }
       }

       return ls; 
    }
}
