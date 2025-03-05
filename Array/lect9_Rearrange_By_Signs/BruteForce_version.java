import java.util.ArrayList;

public class BruteForce_version {
// Here the positive and negative are not equal
    public static void main(String[] args) {
        int[] array = {-3,1,2,-5,2,-4,8,4};// {-3,-1,-2,-5,2,-4,8,4};
        ArrayList<Integer> pos =new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i]<0) 
                neg.add(array[i]);
            else
                pos.add(array[i]);
        }
        

        if (pos.size() > neg.size() ) {
            for (int i = 0; i < neg.size(); i++) {
                array[2*i]= pos.get(i);
                array[2*i+1] = neg.get(i);
            }

            int index = neg.size() * 2;
            for (int i= neg.size(); i < pos.size(); i++) {
                array[index] =pos.get(i);
                index++;
                
            }
        }
        else{

            for (int i = 0; i <pos.size(); i++) {
                array[2*i]= pos.get(i);
                array[2*i+1] = neg.get(i);
            }

            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                array[index]= neg.get(i);
                index++;
            }
        }

        for (Integer integer : array) {
            System.out.print(integer+" ");
        }

    }
}