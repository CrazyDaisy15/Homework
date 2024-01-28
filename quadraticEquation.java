import java.util.Scanner;
public class quadraticEquation {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        double descriminant = b * b - 4.0 * a * c;
        double r1 = (-b + Math.pow(descriminant, 0.5)) / (2.0 * a);
        double r2 = (-b - Math.pow(descriminant, 0.5)) / (2.0 * a);
        System.out.println("The roots are " + r1 + " and " + r2);
    }
}
