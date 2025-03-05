

public class BruteForce {

    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 1 }, { 6, 2, 8 }, { 9, 2, 8 } };
        // int n = matrix.length;
        int ans[][]= rotateMatrix(matrix);
        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j <ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}