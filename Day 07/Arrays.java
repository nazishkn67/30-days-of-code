import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);          //creates scanner object
        int n = scan.nextInt();                         //takes array size input
        int[] arr = new int[n];                         //declares array
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();                //takes array elements as input
            }
            
            for(int i=n-1; i>=0; i--) {
                System.out.print(arr[i] + " ");         //prints array elements in descending order
            }

        scan.close();                                   //closes scanner object
    }
}
