import java.util.HashMap;

public class TwoSumBetter {

    static int[] checkSum(int[] array, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[2];
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int more = target - a;
            if (map.containsKey(more)) {
                arr[0] = more;
                arr[1] = a;
                return arr;
            } 
            map.put(a, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 6, 7, 9, 13, 15 };
        int target = 5;
        int[] arr = checkSum(array, target);
        if (arr[0]==0) {
            
        }
        System.out.println(arr[0] + " " + arr[1]);
    }

}
