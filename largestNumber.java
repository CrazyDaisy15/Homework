public class largestNumber {
public static void main(String[] args) {
    int[] numbers = {8, 3, 15, 1, 6};
    int maxNumber = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > maxNumber) {
            maxNumber = numbers[i];
        }
    }
    System.out.println("The largest number in this array is " + maxNumber);
}
}