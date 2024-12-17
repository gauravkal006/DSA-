public class SecondLargest {
    public static void main(String[] args) {

        int[] array = { 2, 8, 3, 10, 9, 11 };
        int MAX = array[0];
        int SecondMAX = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > MAX) {
                SecondMAX = MAX;
                MAX = array[i];
            } else if (array[i] > SecondMAX && array[i] != MAX)
                SecondMAX = array[i];

        }

        System.err.println("SecondLargest:" + SecondMAX);
        System.err.println("Largest:" + MAX);
    }
}
