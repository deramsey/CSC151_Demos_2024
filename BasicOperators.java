import java.util.Scanner;

class BasicOperators {
    double num1;
    double num2;
    static Scanner in = new Scanner(System.in);

    BasicOperators(double a, double b) {
        this.num1 = a;
        this.num2 = b;
    }

    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        double num1 = in.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = in.nextDouble();

        BasicOperators numbers = new BasicOperators(num1, num2);

        numbers.addNumbers(numbers.num1, numbers.num2);
    }

    void addNumbers(double a, double b) {
        System.out.println(a + b);

        subtractNumbers(a, b);
        multiplyNumbers(a, b);
        divideNumbers(a, b);
    }

    void subtractNumbers(double a, double b) {
        System.out.println(a - b);
    }

    void multiplyNumbers(double a, double b) {
        System.out.println(a * b);
    }

    void divideNumbers(double a, double b) {
        System.out.println(a / b);
    }

}
