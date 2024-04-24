import java.util.Scanner;

class AboutArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array: ");
        // int size = sc.nextInt();
        // int[] numbers = {0, 0, 0, 0};
        // int[] numbers = new int[size];
        int[] knownValues = { 1, 2, 3, 4, 5, 6 };
        knownValues[0] = 24;

        for (int value : knownValues) {
            value *= 2;
        }

        /*
         * for (int i = 0; i < knownValues.length; i++) {
         * knownValues[i] *= 2;
         * }
         */

        for (int value : knownValues) {
            System.out.println(value);
        }
    }
}