package algorithm.easy;

public class BitmapHoleCounter {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };
        System.out.println(countHoles(matrix));  // Output: 3
    }

    public static int countHoles(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                    dfs(matrix, i, j, rows, cols);
                }
            }
        }

        return count;
    }

    public static void dfs(int[][] matrix, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[i][j] != 0) {
            return;
        }
        matrix[i][j] = -1;  // mark as visited
        dfs(matrix, i + 1, j, rows, cols);
        dfs(matrix, i - 1, j, rows, cols);
        dfs(matrix, i, j + 1, rows, cols);
        dfs(matrix, i, j - 1, rows, cols);
    }
}
