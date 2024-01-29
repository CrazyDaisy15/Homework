import java.util.Scanner;
public class trianglePerimeter2 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        double a = input.nextDouble();
        System.out.print("B: ");
        double b = input.nextDouble();
        System.out.print("C: ");
        double c = input.nextDouble();

        System.out.println("P="+ (a + b + c));
    }
}
