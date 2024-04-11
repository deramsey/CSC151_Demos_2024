import java.util.Scanner;

class TempConvert {
    static Scanner sc = new Scanner(System.in);
    double finalTemp;
    String finalUnit;

    TempConvert(int t, String u) {
        finalTemp = u.equals("C") ? cToF(t) : fToC(t);
        finalUnit = u.equals("C") ? "F" : "C";
    }

    public static void main(String[] args) {
        System.out.print("Enter temp value: ");
        if (sc.hasNextInt()) {
            int temp = sc.nextInt();
            System.out.print("Enter temp unit: ");
            sc.nextLine();
            String tempUnit = sc.nextLine();

            TempConvert convert = new TempConvert(temp, tempUnit);

            System.out.println(convert.finalTemp + " " + convert.finalUnit);
        } else {
            System.out.println("Temp must be integer");
        }
    }

    double cToF(int t) {
        double convert = t * (9.0 / 5.0);
        return convert + 32;
    }

    double fToC(int t) {
        double convert = (t - 32) / (9.0 / 5.0);
        return convert;
    }
}
