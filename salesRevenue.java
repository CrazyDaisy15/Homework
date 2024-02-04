import java.util.Scanner;
public class salesRevenue {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Еnter unit price: ");
        float unitPrice = Float.parseFloat(scan.nextLine());
        System.out.print("Enter quantity: ");
        int unitsSold = Integer.parseInt(scan.nextLine());
        double salesRevenue;
        double discountRate = 0;

        salesRevenue = unitsSold * unitPrice;

        if (unitsSold >= 100 && unitsSold <= 120) {
            discountRate = 0.15;
        } else if (unitsSold > 120) {
            discountRate = 0.20;
        }
        double discountAmount = salesRevenue * discountRate;
        double discountedRevenue = salesRevenue - discountAmount;

        System.out.printf("The revenue from sale: $%.2f\n", discountedRevenue);
        System.out.printf("Discount: %.0f%%.\n", discountRate * 100);
    }
}