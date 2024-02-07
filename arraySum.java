public class arraySum {
    public static void main(String[] args) {
        int[] array = {4, 1, 10, 6, 9, 0};
                int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements is " + sum);
        }
    }