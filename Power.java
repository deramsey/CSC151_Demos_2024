import java.util.Scanner;

class Power {
    static Scanner in = new Scanner(System.in);
    long result;

    Power(long b, long e) {
        result = pow(b, e);
    }

    public static void main(String[] args) {
        System.out.print("Enter base: ");
        long base = in.nextInt();

        System.out.print("Enter exponent: ");
        long exp = in.nextInt();

        Power a = new Power(base, exp);
        System.out.println("Result: " + a.result);
    }

    long pow(long b, long e) {
        if (e > 1) {
            return b * pow(b, e - 1);
        }
        return b;
    }

}
