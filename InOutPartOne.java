import java.util.Scanner;
import java.util.Random;

class InOutPartOne {
    static Scanner in = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        // System.out.println(System.out);
        // System.out.println(in);
        int a = r.nextInt(100);
        System.out.println(a);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        in.nextLine();
        System.out.println(x);
        String y = in.nextLine();
        System.out.println(y);
    }
}
