/*Given a matrix of M * N elements (M rows, N columns), return all elements of the matrix in spiral order.*/


public class Solution {
   
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
       ArrayList<Integer> result=new ArrayList<>();
       
       if(A==null||A.size()==0) return result;
       
       int m=A.size();
       int n=A.get(0).size();
        
       int top=0,bottom=m-1;
       int left=0,right=n-1;
       
       while(top<=bottom && left<=right){
           for(int i=left;i<=right;i++){
               result.add(A.get(top).get(i));
           }
           top++;
           
           for(int i=top;i<=bottom;i++){
               result.add(A.get(i).get(right));
           }
           right--;
           
           if(top<=bottom){
               for(int i=right;i>=left;i--){
                   result.add(A.get(bottom).get(i));
               }
               bottom--;
           }
           if(left<=right){
               for(int i=bottom;i>=top;i--){
                   result.add(A.get(i).get(left));
               }
               left++;
           }
       }
       return result;
    }
}

  
   
