import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");

        //user bill
        System.out.print("Please enter the price of your bill: $");
        System.out.print("Please enter the price of your bill: $");
        double bill = scan.nextDouble();

        // tip percent
        System.out.print("What percent would you like to tip?: ");
        double tip = scan.nextDouble();
        tip /= 100;

        //tip amount
        double tipAmount = bill * tip;

        //final receipt
        System.out.println();
        System.out.println("Your tip amount will be: $" + String.format("%.2f", tipAmount));
        System.out.print("Your total bill will be: $" + String.format("%.2f", (tipAmount + bill)));
    }
}
