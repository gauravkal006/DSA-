public class Optimal {

    static int[][] rotateMatrix(int[][] matrix)
    {

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
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


// public class Optimal {

//     static int[][] rotateMatrix(int[][] matrix) {
//         int n = matrix.length;

//         // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {  // Start from j = i + 1 to avoid redundant swaps
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         // Step 2: Reverse each row of the matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][n - 1 - j];
//                 matrix[i][n - 1 - j] = temp;
//             }
//         }

//         return matrix;
//     }

//     public static void main(String[] args) {
//         int[][] matrix = { { 2, 3, 1 }, { 6, 2, 8 }, { 9, 2, 8 } };
//         int ans[][] = rotateMatrix(matrix);

//         // Print the rotated matrix
//         for (int i = 0; i < ans.length; i++) {
//             for (int j = 0; j < ans[i].length; j++) {  // Use ans[i].length for the inner loop
//                 System.out.print(ans[i][j] + " ");
//             }
//             System.out.println();  // Print each row on a new line
//         }
//     }
// }
