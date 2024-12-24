public class LongestSubArrayWithK {
    // brute force approach
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        long k = 3;
        int len = 0;

        for (int i = 0; i < array.length; i++) {
            long s = 0;
            for (int j = i; j < array.length; j++) {
                s += array[j];
                // long s = 0;
                // for (int K = i; K <= j; K++) s += array[K];

                if (s == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        System.out.println("The length of the longest subarray is:" + len);
    }
}
