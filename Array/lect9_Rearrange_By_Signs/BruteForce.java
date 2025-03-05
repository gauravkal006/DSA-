
import java.util.ArrayList;

public class BruteForce {

    public static void main(String[] args) {
        int[] array = {-3,1,2,-5,2,-4};
        ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i]<0) 
                neg.add(array[i]);
            else
                pos.add(array[i]);
        }
        for (int i = 0; i < (array.length)/2; i++) {
            array[2*i]=pos.get(i);
            array[2*i+1]=neg.get(i);

        }

        for (Integer integer : array) {
            System.out.println(integer);
        }

    }
}