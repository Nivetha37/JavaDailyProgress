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
      read description to know know more about string conversion class
     */

    public static String timeConversion(String s) {
    
    try{
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date=inputFormat.parse(s);
        return outputFormat.format(date); 
    }
    catch(ParseException e){
        e.printStackTrace();
        return "Invalid Input";
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
