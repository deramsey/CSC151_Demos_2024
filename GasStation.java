import java.util.Scanner;

class GasStation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter birth year: ");
        int birthYear = sc.nextInt();

        GasStation m = new GasStation();
        m.checkYear(birthYear);

    }

    void checkYear(int by) {
        final int THIS_YEAR = 2024;
        final int AGE_GOAL = 21;

        if (THIS_YEAR - by >= AGE_GOAL) {
            System.out.println("If born on or before today, they're good to go!");
        } else {
            System.out.println("Nah.");
        }
    }
}
