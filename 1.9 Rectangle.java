//Calculate perimeter and area of rectangle
import java.util.*;
class Rectangle{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = m.nextInt();
        while(t-->0){
            System.out.println("Enter Length: ");
            int length=m.nextInt();
            System.out.println("Enter Breadth:");
            int breadth= m.nextInt();
            System.out.println("Perimeter: "+(2*(length)+2*(breadth)));
            System.out.println("Area: "+length*breadth);
        }
    }
}
