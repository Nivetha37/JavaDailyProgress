/*Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example

There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .

Function Description

Complete the migratoryBirds function in the editor below.

migratoryBirds has the following parameter(s):

int arr[n]: the types of birds sighted
Returns

int: the lowest type id of the most frequently sighted birds
*/

import java.util.*;


public class solution{
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int arr[] = new int[n];
        int count[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = m.nextInt();
        }
        for(int i:arr){
            count[i-1]++;
        }
        int max =count[0],res =0;
        for(int i=1;i<n;i++){
            if(count[i]>max){
                max = count[i];
                res = i+1; 
            }
        }
        System.out.println(res);
    }
}
