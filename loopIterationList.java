public class loopIterationList {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        System.out.println("Numbers divisible by 5: ");
        for (int number : numbers) {
            if (number > 150) {
                break;
            }
            if (number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}