public class RemoveZero {
    public static void main(String[] args) {
        int[] array = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };

        int j = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
