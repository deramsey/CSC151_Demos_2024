import java.util.Scanner;

class ConditionDemo {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ConditionDemo a = new ConditionDemo(); // Main a = new Main();

        System.out.print("Enter a whole number: ");
        int y = a.sc.nextInt();

        // a.chained(y);
        a.nested(y);
    }

    void chained(int x) {
        if (x > 10) {
            System.out.println("Greater than 10");
        }

        else if (x == 7) {
            System.out.println("It is 7.");
        }

        else if (x < 10) {
            System.out.println("Less than 10.");
        }

        else {
            System.out.println("It's just 10.");
        }

    }

    void nested(int a) {
        if (a == 0) {
            System.out.println("Number is zero");
        } else if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive and odd");
            }
        } else {
            if (a % 2 == 0) {
                System.out.println("Number is negative and even");
            } else {
                System.out.println("Number is negative and odd");
            }
        }
    }

}
