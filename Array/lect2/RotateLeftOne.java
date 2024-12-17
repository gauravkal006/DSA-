public class RotateLeftOne {
    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 10, 9, 11 };
        int n = array.length;
        int temp = array[0];

        for (int i = 1; i < n; i++) {
            array[i - 1] = array[i];
        }

        array[n - 1] = temp;

        for (int i : array) {
            System.err.print(i + ", ");
        }
    }
}
