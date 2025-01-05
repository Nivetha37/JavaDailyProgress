/*Write a program which does the following:

Declare two integer variables length and width.
Accept two user inputs from the console and store these values in length and width respectively.
Create another integer variable area - compute the area of the rectangle and store it in area.
Output area to the console.*/
// Debug the given code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int length, width;
        int area;
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        width = scanner.nextInt();
        
        area = length * width;
        System.out.println("Area of the rectangle is: "+area); 
	}
}
