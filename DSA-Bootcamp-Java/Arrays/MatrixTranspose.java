package Arrays;

//leetcode easy
//leetcode url https://leetcode.com/problems/transpose-matrix/
import java.util.Arrays;

class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] result = transpose(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println("Result is " + result[i][j]);
            }
            System.out.println("*****");
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];

            }
        }
        return result;
    }
}