/*Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
Determine if the columns are also in ascending alphabetical order, top to bottom.
Return YES if they are or NO if they are not.*/
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m  = new Scanner(System.in);
        int t = m.nextInt();
        while(t-->0){
            int n = m.nextInt();
            m.nextLine();
            String s[] = new String[n];
            
            for(int i=0;i<n;i++){
                s[i] = m.nextLine().trim();
                char ch[] = s[i].toCharArray();
                Arrays.sort(ch);
                s[i] = String.valueOf(ch);
            }
            
            
            boolean b = true;
            int len = s[0].length();
            
           for(int i=0;i<len;i++){
               for(int j=0;j<n-1;j++){
                   if(s[j].charAt(i)>s[j+1].charAt(i)){
                       b=false;
                       break;
                   }
               }
               if(b==false) break;
               
               
           }  
           System.out.println(b==true?"YES":"NO");
        }
        
        
    }
}
