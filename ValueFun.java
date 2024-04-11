import java.util.Scanner;

class ValueFun {
    static Scanner sc = new Scanner(System.in);
    double triArea;

    ValueFun(double b, double h) {
        triArea = calcArea(b, h);
    }

    public static void main(String[] args) {
        System.out.print("Enter base: ");
        double triBase = sc.nextDouble();

        System.out.print("Enter height: ");
        double triHeight = sc.nextDouble();

        ValueFun ob = new ValueFun(triBase, triHeight);
        System.out.println("Triangle area: " + ob.triArea);
    }

    double calcArea(double b, double h) {
        double triArea = b * h * .5;
        // System.out.println("Hello!");
        return triArea;

    }
}
