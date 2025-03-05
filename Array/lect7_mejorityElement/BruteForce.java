public class BruteForce {
    public static void main(String[] args) {
        int[] array = { 2, 2, 3, 3, 1, 3, 3};

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > (array.length) / 2) {
                System.out.println(array[i]);
                break;
            } 
            
        }

    }
}
