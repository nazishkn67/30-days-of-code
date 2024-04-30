import java.io.*;
import java.util.*;

class Result {
    public static int factorial(int n) {
        if(n <= 1)     //base case
            return 1;
        else           //recursive case
            return n * factorial(n-1);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);    //creates scanner object
        int n = sc.nextInt();                   //takes integer input

        int result = Result.factorial(n);       //calling recursive function
        System.out.println(result);             //printing result to the console
        sc.close();                             //closes scanner object
    }
}
