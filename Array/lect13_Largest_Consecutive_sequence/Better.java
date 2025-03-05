import java.util.Arrays;

public class Better {

    static int findSequence(int[] a) {

        if (a.length == 0)
            return 0;

        int count = 0;
        int longest = 1;
        int lastSmallest = Integer.MIN_VALUE;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {

            if (a[i] - 1 == lastSmallest) {
                count = count + 1;
                lastSmallest = a[i];
            } else if (a[i] != lastSmallest) {
                count = 1;
                lastSmallest = a[i];
            }
            longest = Math.max(count, longest);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] a = { 102, 2, 101, 100, 3, 1, 5, 4 };

        int ans = findSequence(a);

        System.out.println(ans);
    }
}
