import java.util.ArrayList;
import java.util.Arrays;

public class Better {

                
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> maxtrix,int n,int m)
    {

        int[] row= new int[n];
        int[] column = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maxtrix.get(i).get(j)==0) {
                    row[i] =1;
                    column[j] =1;


                }
            }
        } 

        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i]==1 || column[j]==1 ) {
                    maxtrix.get(i).set(j,0);
                }
            }
            
        }

        return maxtrix;
    
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> maxtrix = new ArrayList<>();
        maxtrix.add(new ArrayList<>(Arrays.asList(5,1,8)));
        maxtrix.add(new ArrayList<>(Arrays.asList(2,0,9)));
        maxtrix.add(new ArrayList<>(Arrays.asList(3,8,0)));

        int n = maxtrix.size();
        int m = maxtrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(maxtrix,n,m);

        for (ArrayList<Integer> row : ans) {
            for (Integer ele: row) {
                System.out.print(ele +" ");
            }
            System.out.println();
        }


    }
}