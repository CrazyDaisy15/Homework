import java.util.Scanner;
public class eligibleToWork {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Age = ");
        int age = Integer.parseInt(scan.nextLine());
        if (age > 16) {
            System.out.println("The person is eligible to work.");
        } else {
            System.out.println("The person is NOT eligible to work.");
        }
    }
}