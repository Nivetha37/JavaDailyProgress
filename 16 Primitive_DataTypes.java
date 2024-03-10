import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        \\byte   (8 bit): -128    to 128
        \\short  (16 bit):-32,768 to 32,768
        \\int    (32 bit):-2^31   to (2^31)-1
        \\long   (64 bit):-2^63   to (2^63)-1

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>=-128 && x<=127)System.out.println("* byte");
                
                if(x>= Math.pow(-2,15) && x<=Math.pow(2,15)-1)System.out.println("* short");

                if(x>= Math.pow(-2,31) && x<= Math.pow(2,31)-1)System.out.println("* int");

                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



