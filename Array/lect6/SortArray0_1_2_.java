public class SortArray0_1_2_ {
// Implementing the Dutch National Flag Algorithm
    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = array.length;

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                int temp = array[mid];
                array[mid] = array[low];
                array[low] = temp;

                mid++;
                low++;
            } else if (array[mid] == 1) {
                mid++;
            } else {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;

                high--;

            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
