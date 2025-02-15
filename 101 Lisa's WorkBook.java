/*Lisa just got a new math workbook. 
A workbook contains exercise problems, grouped into chapters.
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's book is as follows:
There are  chapters in Lisa's workbook, numbered from  to .
The  chapter has  problems, numbered from  to .
Each page can hold up to  problems. Only a chapter's last page of exercises may contain fewer than  problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at .
Given the details for Lisa's workbook, can you count its number of special problems?*/
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int t = m.nextInt();
        int arr[] = new int[n];
        for(int a=0;a<n;a++){
            arr[a] = m.nextInt();
        }
        while(t-->0){
            int i = m.nextInt();
            int j = m.nextInt();
            
           
            int min = Integer.MAX_VALUE;
            for(int a=i;a<=j;a++){
                min = Math.min(min,arr[a]);
                
            }
            
            System.out.println(min);
        }
        
        
        
    }
}
