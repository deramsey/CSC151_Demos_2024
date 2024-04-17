import java.util.Scanner;

class WhileTriangle {
    Scanner sc = new Scanner(System.in);
    int levels;
    int output;

    WhileTriangle() {
        levels = sc.nextInt();
        output = drawTriangle(levels);
    }

    public static void main(String[] args) {
        System.out.print("Enter base value: ");
        WhileTriangle s = new WhileTriangle();
    }

    int drawTriangle(int start) {
        int x = 1;

        while (x <= start) {
            int temp = x;
            while (temp > 0) {
                System.out.print("* ");
                temp--;
            }
            System.out.print("\n");
            x++;
        }

        return 0;
    }
}
