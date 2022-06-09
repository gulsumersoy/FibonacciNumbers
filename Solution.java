import java.io.*;
import java.util.*;

public class Solution {
    
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
            
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close(); 
        int result = fibonacci(n);
        System.out.println(result);
       
    }
}
