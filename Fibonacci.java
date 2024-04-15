import java.util.Scanner;

class Fibonacci {
    static Scanner sc = new Scanner(System.in);
    int result;

    Fibonacci(int a) {
        result = fib(a);
    }

    public static void main(String[] args) {
        System.out.print("Enter location in fibonnaci sequence: ");
        Fibonacci a = new Fibonacci(sc.nextInt());
        System.out.println(a.result);
    }

    int fib(int x) {
        if (x > 1) {
            return fib(x - 1) + fib(x - 2);
        }
        return x;
    }
}
