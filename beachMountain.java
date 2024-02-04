import java.util.Scanner;
public class beachMountain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Beach or Mountain: ");
        String vacationType = scan.nextLine();

        if (vacationType.equalsIgnoreCase("Beach")) {
            System.out.print("Enter budget per person: ");
            double budgetPerDay = scan.nextDouble();
            if (budgetPerDay < 50) {
                System.out.println("You should consider a vacation in Bulgaria.");
            } else {
                System.out.println("You may consider a vacation abroad.");
            }
        } else if (vacationType.equalsIgnoreCase("Mountain")) {
            System.out.print("Enter budget per person: ");
            double budgetPerDay = scan.nextDouble();
            if (budgetPerDay < 30) {
                System.out.println("You should consider a vacation in Bulgaria.");
            } else {
                System.out.println("You may consider a vacation abroad.");
            }
        } else {
            System.out.println("There is no information about that type of vacation.");
        }
    }
}