import java.util.Random;

class FinishLoops {

    public static void main(String[] args) {
        FinishLoops m = new FinishLoops();
        m.conLoop();
    }

    void breakLoop() {
        int x = 10;
        while (x > 0) {
            System.out.println(x);
            if (x == 3) {
                break;
            }
            x--;
        }
    }

    void breakIndefinite() {
        Random r = new Random();
        int num;

        while (true) {
            num = r.nextInt(5);
            System.out.println(num);
            if (num == 3) {
                break;
            }
        }
    }

    void conLoop() {
        int x = 10;
        for (int i = x; i > 0; i--) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
