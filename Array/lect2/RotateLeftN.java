// import java.util.*;

// public class RotateLeftN {

//     static void rotateLeft(int a[], int d, int n) {
//         d = d % n;

//         int[] temp = new int[d];

//         for (int i = 0; i < d; i++) {
//             temp[i] = a[i];
//         }

//         for (int i = d; i < n; i++) {
//             a[i - d] = a[i];
//         }

//         for (int i = n - d; i < n; i++) {
//             a[i] = temp[i - (n - d)];
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int d = sc.nextInt();
//         int[] array = { 2, 8, 3, 10, 9, 11 };
//         int n = array.length;
//         rotateLeft(array, d, n);
//         System.err.println("After rotate:");
//         for (int i : array) {
//             System.err.print(i + " ");
//         }
//     }
// }

import java.util.*;

public class RotateLeftN {

    static void reverseArray(int array[], int start, int end) {
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 2, 8, 3, 10, 9, 11 };
        int end = array.length;
        int start = 0;
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        reverseArray(array, start, d - 1);
        reverseArray(array, d, end - 1);
        reverseArray(array, start, end - 1);

        for (int i : array) {
            System.err.print(i + " ");
        }
        sc.close();
    }
}