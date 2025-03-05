
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Optimal {

    static List<Integer> findNextPermutaion(List<Integer> A)
    {

        int ind= -1;
        int n= A.size();
        for (int i = n-2; i>=0; i--) {
            if (A.get(i) < A.get(i+1)) {
                ind=i;
                break;
            }
        }

        if (-1==ind) {
            Collections.reverse(A);
            return A;
        }

        for (int i = n-1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int temp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, temp);
                break;
            }
        }

        List<Integer> subList = A.subList(ind+1, n);
        Collections.reverse(subList);

        return A;

    }
    public static void main(String[] args) {
        List<Integer> A= new ArrayList<>(Arrays.asList(1,2,3));

        List<Integer> ans = findNextPermutaion(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }



    }
}
