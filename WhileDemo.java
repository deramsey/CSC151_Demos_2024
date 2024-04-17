import java.util.Random;

class WhileDemo {
    static Random r = new Random();

    public static void main(String[] args) {
        // countdown(10);
        indefinite(true);
    }

    static void countdown(double start) {
        while (start >= 0) {
            System.out.println("Start = " + start);
            start -= .5;
        }
    }

    static void indefinite(boolean start) {
        while (start) {
            int picked = r.nextInt(10);
            System.out.println(picked);
            if (picked == 5) {
                start = false;
            }
        }
    }
}