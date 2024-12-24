public class NumberAppearsOnce {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,5,5,6,6};

        int xorr=0;

        for (int i = 0; i < array.length; i++) {
            System.out.print(xorr+" ^ "+array[i]);
            xorr = xorr ^ array[i]; 
            System.out.println(" ="+xorr);
        }

        System.out.println("The missing number is: " + (xorr));
    }
}
