
public class Solution {



    private static final Scanner scanner = new Scanner(System.in);          //creates Scanner object

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();                                                    //closes Scanner object
        
       for(int i = 1; i<= 10; i++ )
       {
           int mul = n * i;
           System.out.println(n + " x " + i + " = " + mul);                 //prints multiples of integer n
       }
    }
}
