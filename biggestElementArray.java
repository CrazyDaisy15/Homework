public class biggestElementArray {
    // Find biggest element of an array and print it in the console
    public static void main(String[] args) {
        int[] array = {1, 15, 4, 0, 8, 11, 13};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest element in the array is " + max);
    }
}