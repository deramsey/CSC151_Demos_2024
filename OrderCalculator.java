import java.util.Scanner;

class OrderCalculator {
    static Scanner sc = new Scanner(System.in);
    final double COST = 7.99;
    double discMod;
    double finalCost;

    OrderCalculator(int qty) {
        discMod = discount(qty);
        finalCost = COST * qty * discMod;
    }

    public static void main(String[] args) {
        System.out.print("Enter quantity purchased: ");
        int quantity = sc.nextInt();
        OrderCalculator order = new OrderCalculator(quantity);
        System.out.printf("Final Cost: %.2f", order.finalCost);

    }

    double discount(int q) {
        if (q >= 500) {
            return .75;
        } else if (q >= 100) {
            return .9;
        } else {
            return 1.0;
        }
    }

}
