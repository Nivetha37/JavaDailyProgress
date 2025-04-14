/*A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.

NASA_Mars_Rover.jpg

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of the SOS message have been changed by radiation.

Example


The original message was SOSSOS. Two of the message's characters were changed in transit.*/
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        String s = m.nextLine().trim();
        int count =0;
        for(int i=0;i<s.length()-3;i+=3){
            String str = s.substring(i,i+4);
            if(!(str.equals("SOS"))){
                if(str.charAt(0)!='S') count++;
                if(str.charAt(1)!='O') count++;
                if(str.charAt(2)!='S') count++;
                }
        }
        System.out.println(count);
    }
}
