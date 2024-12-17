/*Write a program to check whether the three given numbers as input are Positive, Negative, or Zero.*/
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt(); // input first number
        // Check first number
        
        System.out.println(num>0?"Positive":num<0?"Negative":"Zero");
        
        
        num = scanner.nextInt(); // input second number
        // Check second number
        System.out.println(num>0?"Positive":num<0?"Negative":"Zero");

        
        
        num = scanner.nextInt(); // input third number
        // Check third number
        System.out.println(num>0?"Positive":num<0?"Negative":"Zero");

        
    }
}
