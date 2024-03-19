import java.util.Scanner;

public class GPACalc {

    static Scanner in = new Scanner(System.in);

    double avg;

    GPACalc(double g1, double g2, double g3, double g4) {
        this.avg = (g1 + g2 + g3 + g4) / 4;
    }

    public static void main(String[] args) {
        double c1, c2, c3, c4;

        System.out.print("Enter grade 1: ");
        c1 = in.nextDouble();

        System.out.print("Enter grade 2: ");
        c2 = in.nextDouble();

        System.out.print("Enter grade 3: ");
        c3 = in.nextDouble();

        System.out.print("Enter grade 4: ");
        c4 = in.nextDouble();

        GPACalc grades = new GPACalc(c1, c2, c3, c4);
        System.out.println("Grade Point Average: " + grades.avg);
    }

}
