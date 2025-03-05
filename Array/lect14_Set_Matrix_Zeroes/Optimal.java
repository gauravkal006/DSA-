import java.util.ArrayList;
import java.util.Arrays;

public class Optimal {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> maxtrix, int n, int m) {

        // int[] row= new int[n]; -->matrix[0][..]
        // int[] column = new int[m];--> matrix[..][0]
        int col0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxtrix.get(i).get(j) == 0) {
                    maxtrix.get(i).set(0, 0);

                    if (j != 0)
                        maxtrix.get(0).set(j, 0);
                    else
                        col0 = 0;

                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (maxtrix.get(i).get(j) != 0) {
                    if (maxtrix.get(0).get(j) == 0 || maxtrix.get(i).get(0) == 0) {
                        maxtrix.get(i).set(j, 0);
                    }
                }
            }
        }

        if (maxtrix.get(0).get(0) == 0) {
            for (int j = 0; j < m; j++)
                maxtrix.get(0).set(j, 0);
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                maxtrix.get(i).set(0, 0);
            }
        }
        return maxtrix;

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> maxtrix = new ArrayList<>();
        maxtrix.add(new ArrayList<>(Arrays.asList(5, 1, 8)));
        maxtrix.add(new ArrayList<>(Arrays.asList(2, 0, 9)));
        maxtrix.add(new ArrayList<>(Arrays.asList(3, 8, 0)));

        int n = maxtrix.size();
        int m = maxtrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(maxtrix, n, m);

        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
