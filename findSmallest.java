import java.util.Scanner;
public class findSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        System.out.print("Enter third number: ");
        int z = scanner.nextInt();
        int smallest = findSmallest(x, y, z);

        System.out.println("The smallest number is: " + findSmallest(x, y, z));
    }
    public static int findSmallest(int x, int y, int z) {
        int smallest = x;
        if (y < smallest) {
            smallest = y;
        }
        if (z < smallest) {
            smallest = z;
        }
        return smallest;
    }
    }