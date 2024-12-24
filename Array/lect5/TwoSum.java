public class TwoSum {

    static int[] checkSum(int[] array, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                

                if (array[i] + array[j] == target) {
                    
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 6, 7, 9, 13, 15 };
        int target = 5;
        int[] arr = checkSum(array, target);
        if (arr.length == 0) {
            System.out.println("No solution found.");
        } else {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
