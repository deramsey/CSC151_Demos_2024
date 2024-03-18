import java.util.Scanner;

class SimpleInterest {
    static Scanner sc = new Scanner(System.in);
    double p, r, si, total;
    int t;

    SimpleInterest(double pr, double ir, int ti) {
        this.p = pr;
        this.r = ir;
        this.t = ti;
        this.si = (this.p * this.r * this.t) / 100;
        this.total = this.p + this.si;
    }

    public static void main(String[] args) {
        System.out.print("Enter principle balance: $");
        double pb = sc.nextDouble();

        System.out.print("Enter interest rate: ");
        double ir = sc.nextDouble();

        System.out.print("Enter time: ");
        int ti = sc.nextInt();

        SimpleInterest test = new SimpleInterest(pb, ir, ti);
        System.out.printf("Interest: $ %.2f\n", test.si);
        System.out.printf("Total paid: $ %.2f", test.total);
    }

}
