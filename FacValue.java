import java.util.Scanner;

class FacValue {
    static Scanner in = new Scanner(System.in);
    int result;

    FacValue(int i) {
        result = factorial(i);
    }

    public static void main(String[] args) {
        System.out.print("Enter nuber for factorial: ");
        FacValue a = new FacValue(in.nextInt());
        System.out.println(a.result);
    }

    int factorial(int x) {
        if (x > 1) {
            return x * factorial(x - 1);
        }
        return x;
    }
}
