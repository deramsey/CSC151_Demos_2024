import java.util.Scanner;

class Factorial {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Factorial test = new Factorial();
        System.out.print("Enter number for factorial: ");
        test.factorial(1, test.sc.nextInt());
    }

    void factorial(int x, int c) {
        if (c > 1) {
            factorial(x * c, c - 1);
        } else {
            System.out.println(x);
        }
    }

}
