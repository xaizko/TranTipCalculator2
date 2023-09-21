import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TipCalculator {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //item list management
        List<String> itemName = new ArrayList<>();
        String item;

        System.out.println("Welcome to the tip calculator!");
        System.out.println();

        //user bill
        double bill = 0;
        double itemPrice = 0;
        while (itemPrice != -1)
        {
            System.out.print("Enter the cost of the item in dollars and cents (-1 to end): ");
            itemPrice = scan.nextDouble();
            scan.nextLine();
            if (itemPrice == -1)
            {
                break;
            }

            //capture item
            System.out.print("Enter the item: ");
            item = scan.nextLine();
            itemName.add(item);

            bill += itemPrice;
        }

        //people ate
        System.out.print("How many people did you eat with? ");
        int people = scan.nextInt();

        // tip percent
        System.out.print("What percent would you like to tip? (0-100): ");
        double tip = scan.nextDouble();
        tip /= 100;

        //tip amount
        double tipAmount = bill * tip;

        // people calculations
        double perPersonPre = bill / people;

        double personTip = tipAmount / people;

        double costPer = perPersonPre + personTip;

        //final receipt
        System.out.println();
        System.out.println("----------------");
        System.out.println("Total bill before tip: $" + String.format("%.2f", bill));
        System.out.println("Total tip percentage: " + (tip*100) + "%");
        System.out.println("Your tip amount will be: $" + String.format("%.2f", tipAmount));
        System.out.println("Your total bill with tip will be: $" + String.format("%.2f", (tipAmount + bill)));

        //other people info
        System.out.println("----------------");
        System.out.println("Per person cost before tip: $" + String.format("%.2f", perPersonPre));
        System.out.println("Tip per person: $" + String.format("%.2f", personTip));
        System.out.println("Total cost per person: $" + String.format("%.2f", costPer));
        System.out.println("----------------");

        //print item name
        System.out.println("Items ordered: ");
        for (String i : itemName)
        {
            System.out.println(i);
        }
    }
}
