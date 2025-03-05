public class BruteForce {
    public static void main(String[] args) {
        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    
                }
                maxi = Math.max(maxi, sum);
            }
        }

        System.out.println(maxi);
    }
}
