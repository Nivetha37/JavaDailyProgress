/*You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). 
The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
A row i is weaker than a row j if one of the following is true:
The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
*/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> ls = new ArrayList<>();

        for(int i=0;i<mat.length;i++){
            ls.add(new int[]{SoldierCount(mat[i]),i});
        }

        Collections.sort(ls,(a,b) -> {
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(a[1],b[1]);
        });

        int []res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = ls.get(i)[1];
        }

        return res;
    }

    public static int SoldierCount(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first<last){
            int mid = first+(last-first)/2;
            if(mid == 0)first = mid+1;
            else  last = mid-1;
        }
        return last-1;
    }
}
