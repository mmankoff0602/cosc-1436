import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        // Parse subtotal from the command line
        // Read a subtotal from standard input
        double subTotal;
        final double STATE_TAX_RATE = 0.04;
        final double COUNTY_TAX_RATE = 0.02;
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your subtotal:");
            subTotal = scanner.nextDouble();

            if (subTotal == 0.0) {
                break;
            }

            // Do our calculation
            double stateTaxAmount = STATE_TAX_RATE * subTotal;
            double countyTaxAmount = COUNTY_TAX_RATE * subTotal;
            double taxTotal = countyTaxAmount + stateTaxAmount;
            double total = subTotal + taxTotal;

            // Output the results
            System.out.println(total);
        }
    }
}
