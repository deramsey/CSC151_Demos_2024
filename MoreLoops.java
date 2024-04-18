class MoreLoops {

    public static void main(String[] args) {
        MoreLoops m = new MoreLoops();
        m.doCountdown(10);
    }

    void forCountdown(int start) {
        for (int i = start; i > 0; i--) {
            System.out.println(i);
        }
    }

    void doCountdown(int start) {
        do {
            start--;
            System.out.println(start);
        } while (start > 0);
    }

}
