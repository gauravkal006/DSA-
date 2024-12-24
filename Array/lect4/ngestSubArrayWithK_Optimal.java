
public class ngestSubArrayWithK_Optimal {
    // only works for Positive numbers better approah for negative and positve is
    
    // recommneded
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        long k = 3;
        int maxLen = 0;
        int n = array.length;
        long sum = array[0];
        int left = 0;
        int right = 0;

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= array[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += array[right];
            }
        }
        System.out.println("The length of the longest subarray is: " + maxLen);

    }
}
