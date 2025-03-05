import java.util.HashMap;
import java.util.Map;

public class Better {

    public static int majorityElement(int []array)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int value = map.getOrDefault(array[i], 0);
            map.put(array[i], value+1);

        }

        for (Map.Entry<Integer,Integer> it : map.entrySet()) {
            if (it.getValue() > (array.length / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = { 2, 2, 3, 3, 1, 3, 3 };
        int ans=majorityElement(array);
        System.out.println("The Majority element is :"+ans);

    }
}
