/*A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().

Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.

Example
The first  students arrived on. The last  were late. The threshold is  students, so class will go on. Return YES.

Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late.

Function Description

Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

int k: the threshold number of students
int a[n]: the arrival times of the  students
Returns

string: either YES or NO*/
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int t = m.nextInt();
        
        while(t-->0){
            int n= m.nextInt();
            int k = m.nextInt();
            int arr[] = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                arr[i] = m.nextInt();
                if(arr[i]<=0) count++;
            }
            
            System.out.println(count <k?"YES":"NO");
        }
        m.close();
    }
}
