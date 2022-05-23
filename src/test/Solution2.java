package test;
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



class Result1 {

    /*
     * Complete the 'getString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     * tsraa
     * aarst
     * arstt
     */

    public static String getString(String s) {
    	 char[] ar = s.toCharArray();
         Arrays.sort(ar);
         return String.valueOf(ar);
    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("test1.txt")));

        String s = bufferedReader.readLine();

        String result = Result1.getString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
