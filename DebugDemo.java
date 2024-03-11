import java.util.Scanner;

class DebugDemo {
    public Scanner in = new Scanner(System.in);
    String userName;

    DebugDemo() {
        this.userName = in.nextLine();
    }

    public static void main(String[] args) {
        System.out.print("What is your name:");
        DebugDemo obj = new DebugDemo();
        System.out.println("hello, " + obj.userName);
        System.out.println("Another hello");
    }
}