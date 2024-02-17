import java.util.Scanner;
public class computeAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double z = scanner.nextDouble();

        double average = computeAverage(x, y, z);

        System.out.println("The average of the three numbers is: " + average);
    }
    public static double computeAverage(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}