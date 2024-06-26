// click on description for detailed explanation 


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int n = grades.size();
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i=0;i<n;i++){

        //grades greater than 37
        
        if(grades.get(i)>=38){
            int temp = grades.get(i);
            for(int j=1;j<6;j++){

                // to find nearest multiple of 5
                if(temp%5==0){
                    int res=temp-grades.get(i);
                    if(res<3){
                        result.add(temp);
                        break;    
                    }
                    else{
                        result.add(grades.get(i));
                        break;
                    }                    
                }
                // if not a multiple of 5 increment the count
                else{
                    temp+=1;
                }
            }    
        }
            
        //grades less than 38
        else{
            result.add(grades.get(i));
            
        }
        
    }
    return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
