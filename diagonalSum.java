public class diagonalSum {
    // Find the sum of diagonal elements in the matrix(from top left to bottom right)
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        // The first for loop iterates the rows, the second one the columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Check if row index equals column index
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 8, 4, 11},
                {21, 5, 2, 28},
                {9, 12, 1, 10},
                {15, 28, 7, 6}
        };

        int sum = calculateSum(matrix);

        System.out.println("Sum of diagonal elements is: " + sum);
    }
}