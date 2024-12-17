
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = { 1, 1, 2, 2, 2, 3, 3, 8, 10, 11 };

        int k = removeDuplicate(array);
        // Remove Arrays form the sorted Array
        for (int j = 0; j < k; j++) {
            System.err.println(array[j]);
        }
    }

    static int removeDuplicate(int[] array) {
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                array[i + 1] = array[j];
                i++;
            }

        }
        return i + 1;
    }
}
