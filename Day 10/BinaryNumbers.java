import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));    //creates reader object
        int n = Integer.parseInt(bufferedReader.readLine().trim());                              //takes integer input
        String binary = Integer.toBinaryString(n);                                               //converting integer into equivalent binary string
        int count = 0, max = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                count++;                                                                        //if the occurrence is 1, then increment the count by 1
                max = Math.max(count, max);                                                     //compares the current and max count and stores it in the max variable
            } else {
                count = 0;                                                                      //if the occurrence is 0, then reset the count to 0         
            }
        }
        System.out.println(max);                                                                //print the max count to the console
        bufferedReader.close();                                                                 //close the reader object
    }
}
