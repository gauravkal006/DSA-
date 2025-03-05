public class Optimal {
    //Moore's Voting Algorithm
    public static int majorityElement(int[] array) {

        int count = 0;
        int element = 0;

        for (int i = 0; i < array.length; i++) {
            if (count == 0) {
                count = 1;
                element = array[i];
            } else if (array[i] == element) {
                count++;

            } else
                count--;
        }
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count1++;
            }
        }
        if (count1 > (array.length) / 2) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int ans = majorityElement(array);
        System.out.println(ans);
    }
}
