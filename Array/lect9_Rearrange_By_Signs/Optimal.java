import java.util.ArrayList;
import java.util.Collections;

public class Optimal {
    public static void main(String[] args) {
        int[] array = { 3, 1, -2, -5, 2, -4 };
        int n = array.length;
        int negIndex = 1, posIndex = 0;

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        for (Integer integer : ans) {
            System.out.println(integer);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                ans.set(negIndex, array[i]);
                negIndex += 2;
            } else {
                ans.set(posIndex, array[i]);
                posIndex += 2;
            }
        }

        for (Integer integer : ans) {
            System.out.print(integer+" ");
        }
    }

}
