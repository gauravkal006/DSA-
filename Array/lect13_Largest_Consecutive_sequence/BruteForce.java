public class BruteForce {

    static boolean ls(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    static int findSequence(int[] a) {

        int count = 0;
        int longest = 1;
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            count = 1;
            while (ls(a, x + 1) == true) {
                count = count + 1;
                x = x + 1;
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