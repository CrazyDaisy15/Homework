import java.util.Scanner;
public class DepositCalculator {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Deposit Amount = ");
        double depositAmount = Double.parseDouble(scan.nextLine());
        System.out.print("Deposit Term = ");
        int depositTerm = Integer.parseInt(scan.nextLine());
        System.out.print("Annual Nominal Interest Rate = ");
        double annualNominalInterestRate = Double.parseDouble(scan.nextLine());

        double totalInterest = depositAmount * (annualNominalInterestRate / 100);
        double interestPerMonth = totalInterest / 12;
        double totalAmount = depositAmount + (depositTerm * interestPerMonth);

        System.out.println("Total Amount = "+ totalAmount);
}
}