import java.util.Scanner;

class FarmFence {
    static Scanner in = new Scanner(System.in);
    double amtFence;

    FarmFence(double area) {
        amtFence = calcPerim(area);
    }

    public static void main(String[] args) {
        System.out.print("Enter field area: ");
        double fieldArea = in.nextDouble();

        FarmFence fenceAmount = new FarmFence(fieldArea);
        System.out.println("Total fence needed: " + fenceAmount.amtFence + " units");
    }

    double calcPerim(double a) {
        return Math.sqrt(a) * 4;
    }

}
