/*Two friends, Dragon and Sloth, are writing a computer science examination series. 
There are three subjects in this series: DSA, TOC, and DM.
Each subject carries 100 marks.
You know the individual scores of both Dragon and Sloth in all 3 subjects.
You have to determine who got a better rank.
The rank is decided as follows:
- The person with a bigger total score gets a better rank
- If the total scores are tied, the person who scored higher in DSA gets a better rank
- If the total score and the DSA score are tied, the person who scored higher in TOC gets a better rank
- If everything is tied, they get the same rank.*/
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
		    int DS = m.nextInt();
		    int TOC = m.nextInt();
		    int DM = m.nextInt();
		    int ds = m.nextInt();
		    int toc = m.nextInt();
		    int dm = m.nextInt();
		    int d = DS+TOC+DM, s= ds+toc+dm;
		    System.out.println(d>s||(d==s && DS>ds)||(d==s && DS==ds && TOC>toc )?"DRAGON":d<s||(d==s && DS<ds)||(d==s && DS==ds && TOC<toc )?"SLOTH":"TIE");
		}

	}
}
