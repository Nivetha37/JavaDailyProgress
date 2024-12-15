/*Merging two 1D arrays involves combining the elements of both arrays into a single array while maintaining their original order.

Here's a step-by-step process for merging two 1D arrays:

Create a New Array: Create a new array that is large enough to hold the combined elements of both arrays. 
The size of the new array should be the sum of the sizes of the two original arrays.
Copy Elements: Iterate through the elements of the first array and copy them to the new array.
Then, iterate through the elements of the second array and copy them to the new array after the elements of the first array.
Result: The new array now contains all the elements from both original arrays, merged in the desired order.*/

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		int firstArray[] = new int[100]; // First array
        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;
        int size1 = 3;

        int secondArray[] = new int[100]; // Second array
        secondArray[0] = 8;
        secondArray[1] = 10;
        secondArray[2] = 12;
        secondArray[3] = 14;
        int size2 = 4;
        
        // Update the code below to solve the problem.
        
        int mergedArray[] = new int[size1+size2];
        
        for(int i=0;i<size1+size2;i++){
            if(i<size1){
                mergedArray[i] = firstArray[i];
            }
            else{
                mergedArray[i] = secondArray[i-size1];
            }
        }

        // Print the merged array
        for (int i = 0; i < size1+size2 ; i++) {
            System.out.print(mergedArray[i] + " ");
        }

	}
}
