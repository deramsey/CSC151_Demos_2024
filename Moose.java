import java.util.Scanner;

class Moose {
    static Scanner sc = new Scanner(System.in);
    int totalTines;
    boolean isPositive;
    boolean isEven;

    Moose(int lt, int rt) {
        this.totalTines = lt + rt;
        this.isPositive = totalTines > 0;
        this.isEven = totalTines % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter left side: ");
        int ls = sc.nextInt();
        System.out.print("Enter right side: ");
        int rs = sc.nextInt();

        Moose test1 = new Moose(ls, rs);
        if (!test1.isPositive || test1.totalTines == 0) {
            System.out.println("Not a bull moose!");
        } else if (test1.isEven) {
            System.out.println("There is an even number of tines: " + test1.totalTines);
        } else {
            System.out.println("There is an odd number of tines: " + test1.totalTines);
        }
    }
}
