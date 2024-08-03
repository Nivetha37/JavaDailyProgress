/*A sorting algorithm A is said to have more time complexity than a sorting algorithm B if it uses more number of comparisons for sorting the same array than algorithm B.
Given that algorithm A uses X comparisons to sort an array and algorithm B uses Y comparisons to sort the same array, find whether algorithm A has more time complexity.*/
import java.util.*;

class CodeChef{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        while(t-->0){
            int x = m.nextInt();
            int y = m.nextInt();
            if(x>y) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
