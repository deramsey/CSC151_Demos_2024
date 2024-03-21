import java.util.Scanner;

class NewMethods {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        NewMethods obj = new NewMethods();

        hello(obj.sc.nextLine());
    }

    static void hello(String msg) {
        System.out.println(msg);
    }

}