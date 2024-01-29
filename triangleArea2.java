 import java.util.Scanner;
public class triangleArea2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        double base = input.nextDouble();
        System.out.print("Height: ");
        double height = input.nextDouble();

        System.out.println("Area="+((base * height)/2));
    }
}