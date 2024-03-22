import java.util.Scanner;

class HeartRate {
    static Scanner in = new Scanner(System.in);
    int beats;
    final int SECONDS = 15;

    HeartRate(int a) {
        this.beats = a;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of beats: ");
        int b = in.nextInt();

        HeartRate calc = new HeartRate(b);
        calc.calcRate();
    }

    void calcRate() {
        System.out.println("Heart Rate: " + ((this.beats * 60) / this.SECONDS) + " BPM");
    }

}
