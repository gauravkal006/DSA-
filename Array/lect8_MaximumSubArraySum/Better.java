public class Better {
    public static void main(String[] args) {
        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum +=array[j];
                maxi = Math.max(maxi, sum);
            }
        }

        System.out.println(maxi);
    }
}
