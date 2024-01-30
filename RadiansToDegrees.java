import java.util.Scanner;
public class RadiansToDegrees {
    public static void main(String[] Strings) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radians = ");
        double Radians = Double.parseDouble(scan.nextLine());
        double Degrees = Radians * 180 / Math.PI;

        System.out.println("Degrees = "+ Degrees);
    }
}
