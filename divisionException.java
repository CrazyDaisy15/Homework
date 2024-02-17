import java.util.InputMismatchException;
import java.util.Scanner;
public class divisionException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 0, y = 0;
        try {
            System.out.println("Enter the first number: ");
            x = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            y = scanner.nextDouble();
            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            }
            double result = x / y;
            System.out.println("Result of the division is: " + result);
        } catch
        (InputMismatchException e) {
            System.out.println("Please enter valid numerical values!");
        } catch (ArithmeticException e) {
            }
        }
    }