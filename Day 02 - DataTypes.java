
public class DataTypes {
	
    public static void main(String[] args) {
        int i1 = 4;
        double d1 = 4.0;
        String s1 = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);     //creates scanner object to read input from stdin
      
        int i1 = scan.nextInt();                   // reads input
        double d1 = scan.nextDouble();                     //from stdin 
        scan.nextLine();
        String s1 = scan.nextLine();
        
        System.out.println(i1+i2);           //prints sum of 1st integer and 2nd integer
		    System.out.println(d1+d2);
        System.out.println(s1+s2);           //prints concatenation of 1st string and 2nd string 
        
        scan.close();                        //closes scanner object
    }
}
