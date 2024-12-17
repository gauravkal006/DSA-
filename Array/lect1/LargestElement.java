public class LargestElement {
    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 10, 9 };

        int MAX = array[0];

        for (int index = 0; index < array.length; index++) {
            if (array[index] > MAX)
                MAX = array[index];
        }

        System.out.println(MAX);

    }
}
