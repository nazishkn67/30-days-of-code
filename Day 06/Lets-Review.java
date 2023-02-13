import java.util.*;

public class Solution {

    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);      //creates scanner object
        int t = scan.nextInt();
        scan.nextLine();
      
        for (int i = 0; i < t; i++) {               //this loop will run for t testcases 
            String s = scan.nextLine();
            String even = "", odd = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0)
                    even += s.charAt(j);            //stores even-indices 
                else
                    odd += s.charAt(j);             //stores odd-indices  
            }
            System.out.println(even + " " + odd);
        }
        scan.close();                               //closes scanner object     
    }
}
