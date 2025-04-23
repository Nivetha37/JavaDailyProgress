/*Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.*/

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr []= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();  
        }
        int maximum = arr[0];
        int minimum = arr[0];
        int count1=0,count2=0;
        for(int i=1;i<n;i++){
            int max = Math.max(maximum,arr[i]);
            int min = Math.min(minimum,arr[i]); 
            if(max > maximum){
                maximum = max;
                count1++;
            }
            if(min < minimum){
                minimum = min;
                count2++;
            }
        }
        
        System.out.println(count1+" "+count2);
    }
}
