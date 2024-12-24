public class MissingNumbers {
    public static void main(String[] args) {

        // optimal 1
        // int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };

        // int n = array.length;
        // int sum = (n * (n + 1)) / 2;
        // int s2 = 0;
        // for (int i = 0; i < n - 1; i++) {
        // s2 += array[i];
        // }

        // int missingNum = sum - s2;

        // System.out.println("The missing number is: " + missingNum);

        int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };
        int xor1 = 0;
        int N = array.length;
        int xor2 = 0;

        for (int i = 0; i < N-1 ; i++) {
            xor2 = xor2 ^ array[i];
            xor1 = xor1 ^ i + 1;
        }
        xor1 = xor1 ^ N;
        
        System.out.println("The missing number is: " + (xor2 ^ xor1));
    }
}
