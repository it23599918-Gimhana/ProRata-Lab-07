
import java.util.Scanner;

public class IT23599918Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCustomer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C for Cash, O for Other): ");
            char mode = input.next().charAt(0);

            while (mode != 'C' && mode != 'c'
                    && mode != 'O' && mode != 'o') {
                System.out.println("Payment Mode is Not Valid");
                System.out.print("Enter C or O: ");
                mode = input.next().charAt(0);
            }

            double discount = 0;

            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
            }

            double amountToPay = bill - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Amount to be paid: " + amountToPay);
        }

        input.close();
    }
}
