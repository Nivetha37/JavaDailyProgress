\*Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

*\

\\my code
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                //Complete this line
                if(x<10){
                    System.out.print(s1);
                    for(int j=0;j<(15 -s1.length());j++){
                    System.out.print(" ");
                    }
                    System.out.println("00"+x);
                }
                else if(x<100){
                    System.out.print(s1);
                    for(int j=0;j<(15 - s1.length());j++){
                    System.out.print(" ");
                    }
                    System.out.println("0"+x);
                }
                else{
                    System.out.print(s1);
                    for(int j=0;j<(15 - s1.length());j++){
                    System.out.print(" ");
                    }
                    System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}


\**

Alternate easy code
for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d\n", strings[i], numbers[i]);
        }
**\



