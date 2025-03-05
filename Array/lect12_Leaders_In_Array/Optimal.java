import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Optimal {

    static ArrayList<Integer> findLeader(ArrayList<Integer> a)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.size();
        int max = a.get(n-1);
        ans.add (max);

        for (int i = n-2; i > 0; i--) {
            if (max < a.get(i)) {
                max = a.get(i);
                ans.add(a.get(i));
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10,22,11,0,4,5,6));
        
        ArrayList<Integer> ans = new ArrayList<>() ;
        ans = findLeader(a) ;
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}