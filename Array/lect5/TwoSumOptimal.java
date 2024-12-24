import java.util.*;

public class TwoSumOptimal {

    static int[] checkSum(int[] array, int target) {
        int left=0;
        int[] arr = new int[2];
        int right =array.length-1;
        Arrays.sort(array);
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                arr[0]=right;
                arr[1]=left;
                return arr;
            } else if (sum < target) left++;
            else right--;
        }
        return new int[] {};

    }
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 6, 7, 9, 13, 15 };
        int target = 25;
        int[] arr = checkSum(array, target);
        if (arr.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
