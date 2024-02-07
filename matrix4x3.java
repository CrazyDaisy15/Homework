public class matrix4x3 {
    // Print elements of a given 2-d matrix with 4 rows and 3 columns
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {11, 15, 21}
        };
        System.out.println("Elements of the matrix are ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " " );
            }
System.out.println();
        }
    }
}