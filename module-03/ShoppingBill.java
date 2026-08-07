import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        String productName;
        double price;
        double taxPercentage = 15;
        int quantity;

        Scanner sc = new Scanner(System.in);
        System.out.print("Product Name: ");
        productName = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();

        double subtotal = price * quantity;
        double vat  = subtotal * (taxPercentage/100);
        double total = subtotal + vat;
        System.out.printf("Subtotal: %.2f\nVAT(%.2f): %.2f\nTotal: %.2f",
        subtotal,
        taxPercentage,
        vat,
        total
        );

        sc.close();
    }
}