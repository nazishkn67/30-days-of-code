
public class Operators {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip = tip_percent*0.01*meal_cost;        //calculates tip
    double tax = tax_percent*0.01*meal_cost;        //calculates tax
    double total_cost = meal_cost + tip + tax;      //calculates total cost
    System.out.println(Math.round(total_cost));
    }

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);      //creates scanner object to read input from stdin
      
        double meal_cost = scan.nextDouble();       //reads input
        int tip_percent = scan.nextInt();           //from stdin
        int tax_percent = scan.nextInt();

        solve(meal_cost, tip_percent, tax_percent);  //calls the solve function

        scan.close();                               //closes the scanner object
    }
}
