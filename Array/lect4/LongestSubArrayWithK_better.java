import java.util.HashMap;

public class LongestSubArrayWithK_better {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        long  k = 3;
        int maxLen = 0;
        long sum =0;
        HashMap <Long ,Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (k==sum) {
                maxLen =Math.max(maxLen, i+1);
            }

            long rem = sum -k;
            if (preSumMap.containsKey(rem)) {
                int len = i- preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println("The length of the longest subarray is: " + maxLen);



            
    }
}
