import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int A = read.nextInt();
	        int C = read.nextInt();

	        //return avg value if it's an integer
                //else return -1


	        if((A+C)%2 == 0){
	            System.out.println((A+C)/2);
	        }
	        else{
	            System.out.println(-1);
	        }

	        
	    }
	}
}
