public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 10, 9, 11 };
        int Smallest = array[0];
        int Ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < Smallest) {
                Ssmallest = Smallest;
                Smallest = array[i];
            } else if (array[i] < Ssmallest && Smallest != array[i]) {
                Ssmallest = array[i];

            }
        }

        System.err.println("SecondSmallest:" + Ssmallest);
        System.err.println("Smallest:" + Smallest);
    }
}
