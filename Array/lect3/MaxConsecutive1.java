public class MaxConsecutive1 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1 };
        int count = 0;
        int maxi = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }

        System.out.println("The missing number is: " + (maxi));
    }
}
