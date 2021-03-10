public class ConditionalStatements {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);        //creates scanner object to read input from stdin
        int num = scan.nextInt();
      
        if(num % 2 == 0) 
        {
            if(num >= 2 && num <= 5)
            {
               System.out.println("Not Weird");
            } 
            else if(num > 6 && num <= 20)
            {
               System.out.println("Weird");
            }
            else
            {
               System.out.println("Not Weird");
            }    
        }
        else 
         {
            System.out.println("Weird");
         }
        scan.close();                                 //closes scanner object
    }
}
