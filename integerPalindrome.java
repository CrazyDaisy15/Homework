import java.util.Scanner;
public class integerPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int initial = input;
        int reversed = 0;

        while (input > 0) {
            reversed = input % 10 + reversed * 10;
            input /= 10;
        }

        if (initial == reversed) {
            System.out.println(initial + " is a palindrome.");
        } else {
            System.out.println(initial + " is not a palindrome.");
        }
    }
}