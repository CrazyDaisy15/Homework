import java.util.Scanner;
public class quadraticEquation {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        double a = input.nextDouble();
        System.out.print("B: ");
        double b = input.nextDouble();
        System.out.print("C: ");
        double c = input.nextDouble();

        double descriminant = b * b - 4.0 * a * c;
        double root1 = (-b + Math.pow(descriminant, 0.5)) / (2.0 * a);
        double root2 = (-b - Math.pow(descriminant, 0.5)) / (2.0 * a);
        System.out.println("The roots are " + root1 + " and " + root2);
    }
}
