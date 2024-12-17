import java.util.ArrayList;
import java.util.Arrays;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, };
        int[] array2 = { 2, 8, 10, 11 };
        Arrays.sort(array1);
        Arrays.sort(array2);

        int n1 = array1.length;
        int n2 = array2.length;

        int i = 0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<Integer>();

        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != array1[i])
                    Union.add(array1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != array2[j])
                    Union.add(array2[j]);
                j++;
            }
        }
        while (i < n1) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != array1[i])
                Union.add(array1[i]);
            i++;
        }
        while (j < n2) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != array2[j])
                Union.add(array2[j]);
            j++;
        }

        for (int val : Union) {
            System.out.print(val + " ");
        }

    }
}
