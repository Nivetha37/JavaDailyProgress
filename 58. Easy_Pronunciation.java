/*Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce.
We say that a word is hard to pronounce if it contains 4 or more consonants in a row; otherwise it is easy to pronounce. 
For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.
You are given a string S consisting of N lowercase Latin characters. 
Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.
For the purposes of this problem, the vowels are the characters {a,e,i,o,u} and the consonants are the other 21 characters.*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner m = new Scanner(System.in);
		int t = m.nextInt();
		while(t-->0){
		    int n = m.nextInt();
		    m.nextLine();
		    String s = m.nextLine();
		    int count =0;
		    for(int i=0;i<n;i++){
		        char ch = s.charAt(i);
		        if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
		            count++;
		            if(count==4) break;
		        }
		        else{
		            count =0;
		        }
		    }
		    
		    System.out.println(count>=4?"NO":"YES");
		}

	}
}
