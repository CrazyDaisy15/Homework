import java.util.Scanner;
public class salesRevenue {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Units sold = ");
        int unitsSold = Integer.parseInt(scan.nextLine());
        System.out.print("Sales price = ");
        float salesPrice = Float.parseFloat(scan.nextLine());
        double salesRevenue;
        double discountRate = 0;

        salesRevenue = unitsSold * salesPrice;

        if (unitsSold >= 100 && unitsSold <= 120) {
            discountRate = 0.15;
        } else if (unitsSold > 120) {
            discountRate = 0.20;
        }
        double discountAmount = salesRevenue * discountRate;
        double discountedRevenue = salesRevenue - discountAmount;

        System.out.printf("The revenue from sale: $%.2f\n", discountedRevenue);
        System.out.printf("The discount rate you received is %.0f%%.\n", discountRate * 100);
    }
}