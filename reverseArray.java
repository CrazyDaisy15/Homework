public class reverseArray {
 public static void main(String[] args) {
     int[] numbers = {10, 20, 30, 40, 50};
     for (int number : numbers) {
         System.out.print(number + " ");
     }
     System.out.println("\nReversedlist:");
     for (int i = numbers.length - 1; i >=0; i--) {
         System.out.println(numbers[i] + " ");
     }
     }
 }