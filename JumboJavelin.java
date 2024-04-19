import java.util.Scanner;

class JumboJavelin {
    Scanner in = new Scanner(System.in);
    int result;
    int rods;

    JumboJavelin() {
        rods = validateNumber();
        result = lenTotal(rods) - (rods - 1);
    }

    public static void main(String[] args) {
        JumboJavelin o = new JumboJavelin();
        System.out.println(o.result);

    }

    int lenTotal(int r) {
        System.out.println("Enter lengths: ");
        int total = 0;
        for (int i = 0; i < r; i++) {
            total += in.nextInt();
        }
        return total;
    }

    int validateNumber() {
        System.out.print("Enter number of rods: ");
        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            return validateNumber();
        }
    }
}
