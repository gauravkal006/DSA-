public class Optimal {
    static long maxSubarraySum(int[] array)
    {
        long sum=0,maxi =Long.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum> maxi) {
                maxi=sum;
            }

            if (sum<0) {
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
        long sum=maxSubarraySum(array);
        System.out.println(sum);
    }
}
