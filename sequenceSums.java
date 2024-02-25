import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class sequenceSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of integer numbers separated by spaces: ");
        String[] numbers = scanner.nextLine().split("\\s+");

        List<Integer> sequence = new ArrayList<>();
        for (String number : numbers) {
            sequence.add(Integer.parseInt(number));
        }

        int sum = 0;
        int n = sequence.size() / 2;
        for (int i = 0; i <= n; i++) {
            sum += sequence.get(i) + sequence.get(sequence.size() - 1 - i);
        }
        System.out.println("Sum: " + sum);
        }
    }