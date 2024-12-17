import java.util.ArrayList;

public class Intersection2SortedArray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 4, 11, 14, 16, 20, 22 };
        int[] array2 = { 1, 2, 5, 6, 10, 16, 20 };

        ArrayList<Integer> ans = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        int n = array1.length;
        int m = array2.length;

        while (i < n && j < m) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;

            } else {
                ans.add(array1[i]);
                j++;
                i++;
            }

        }

        for (Integer integer : ans) {
            System.err.println(integer + " ");
        }

    }
}
