import java.util.HashSet;
import java.util.Set;

public class Optimal {

    static int findSequence(int[] a) {

        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        for (Integer integer : set) {
            if (!set.contains(integer - 1)) {
                int count = 1;
                int x = integer;
                while (set.contains(x + 1)) {
                    count = count + 1;
                    x = x + 1;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = { 102, 2, 101, 100, 3, 1, 5, 4 };

        int ans = findSequence(a);

        System.out.println(ans);
    }
}
